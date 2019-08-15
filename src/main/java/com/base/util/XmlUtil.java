package com.base.util;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class XmlUtil
{
  public static Map<String, Object> elementToMap(Element element)
  {
    Map map = new HashMap();
    if (element != null) {
      List children = element.elements();

      if ((children != null) && (children.size() > 0)) {
        for (int i = 0; i < children.size(); ++i) {
          Element child = (Element)children.get(i);
          List childList = child.elements();
          if ((!(childList.isEmpty())) && (childList.size() > 0))
            map.put(child.getName(), elementToList(child));
          else {
            map.put(child.getName(), child.getTextTrim());
          }
        }
      }
    }

    return map;
  }

  public static List<Map<String, Object>> elementToList(Element element)
  {
    List list = new ArrayList();
    if (element != null) {
      List children = element.elements();
      if ((children != null) && (children.size() > 0)) {
        for (int i = 0; i < children.size(); ++i) {
          Element child = (Element)children.get(i);
          list.add(elementToMap(child));
        }
      }
    }
    return list;
  }

  public static Element mapToElement(Map<String, Object> map, Element element)
  {
    if ((map != null) && (!(map.isEmpty()))) {
      List keyList = getMapKey(map);
      for (int i = 0; i < keyList.size(); ++i) {
        String thisKey = (String)keyList.get(i);
        Element child = element.addElement(thisKey);

        Object obj = map.get(thisKey);
        if (obj instanceof List)
          ListToElement((List)obj, child);
        else {
          child.setText((obj != null) ? obj.toString() : "null");
        }
      }
    }

    return element;
  }

  public static void ListToElement(List<Map<String, Object>> list, Element element)
  {
    if ((list != null) && (!(list.isEmpty())))
      for (int i = 0; i < list.size(); ++i) {
        Map map = (Map)list.get(i);
        String elementName = element.getName();
        String listKey = elementName.substring(0, elementName.length() - 1);
        Element listElement = element.addElement(listKey);
        mapToElement(map, listElement);
      }
  }

  public static List<String> getMapKey(Map<String, Object> map)
  {
    List list = new ArrayList();
    for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); ) {
      list.add((String)iterator.next());
    }
    return list;
  }

  public static String doc2String(Document document)
  {
    String s = "";
    try
    {
      ByteArrayOutputStream out = new ByteArrayOutputStream();

      OutputFormat format = new OutputFormat("   ", true, "UTF-8");
      XMLWriter writer = new XMLWriter(out, format);
      writer.write(document);
      s = out.toString("UTF-8");
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return s;
  }

  public static void main(String[] args)
  {
  }
}