package com.base.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.codec.binary.Base64;

public abstract class StringUtil
{
  public static final String regExp_integer_1 = "^\\d+$";
  public static final String regExp_integer_2 = "^[0-9]*[1-9][0-9]*$";
  public static final String regExp_integer_3 = "^((-\\d+) ?(0+))$";
  public static final String regExp_integer_4 = "^-[0-9]*[1-9][0-9]*$";
  public static final String regExp_integer_5 = "^-?\\d+$";
  public static final String regExp_float_1 = "^\\d+(\\.\\d+)?$";
  public static final String regExp_float_2 = "^(([0-9]+\\.[0-9]*[1-9][0-9]*) ?([0-9]*[1-9][0-9]*\\.[0-9]+) ?([0-9]*[1-9][0-9]*))$";
  public static final String regExp_float_3 = "^((-\\d+(\\.\\d+)?) ?(0+(\\.0+)?))$";
  public static final String regExp_float_4 = "^(-(([0-9]+\\.[0-9]*[1-9][0-9]*) ?([0-9]*[1-9][0-9]*\\.[0-9]+) ?([0-9]*[1-9][0-9]*)))$";
  public static final String regExp_float_5 = "^(-?\\d+)(\\.\\d+)?$";
  public static final String regExp_letter_1 = "^[A-Za-z]+$";
  public static final String regExp_letter_2 = "^[A-Z]+$";
  public static final String regExp_letter_3 = "^[a-z]+$";
  public static final String regExp_letter_4 = "^[A-Za-z0-9]+$";
  public static final String regExp_letter_5 = "^\\w+$";
  public static final String regExp_email = "^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+$";
  public static final String regExp_url_1 = "^[a-zA-z]+://(\\w+(-\\w+)*)(\\.(\\w+(-\\w+)*))*(\\?\\S*)?$";
  public static final String regExp_url_2 = "[a-zA-z]+://[^\\s]*";
  public static final String regExp_chinese_1 = "[\\u4e00-\\u9fa5]";
  public static final String regExp_chinese_2 = "[^\\x00-\\xff]";
  public static final String regExp_line = "\\n[\\s ? ]*\\r";
  public static final String regExp_html_1 = "/ <(.*)>.* <\\/\\1> ? <(.*) \\/>/";
  public static final String regExp_startEndEmpty = "(^\\s*) ?(\\s*$)";
  public static final String regExp_accountNumber = "^[a-zA-Z][a-zA-Z0-9_]{4,15}$";
  public static final String regExp_telephone = "\\d{3}-\\d{8} ?\\d{4}-\\d{7}";
  public static final String regExp_qq = "[1-9][0-9]{4,}";
  public static final String regExp_postbody = "[1-9]\\d{5}(?!\\d)";
  public static final String regExp_idCard = "\\d{15} ?\\d{18}";
  public static final String regExp_ip = "\\d+\\.\\d+\\.\\d+\\.\\d+";
  public static final String encoding = "UTF-8";
  public static final Pattern referer_pattern = Pattern.compile("@([^@^\\s^:]{1,})([\\s\\:\\,\\;]{0,1})");

  public static boolean isEmpty(String str)
  {
    return ((str == null) || ("".equals(str.trim())));
  }

  public static boolean regExpVali(String content, String regExp)
  {
    Pattern pattern = Pattern.compile(regExp);
    Matcher matcher = pattern.matcher(content);
    return matcher.matches();
  }

  public static String decimalFormat(double doubleValue, String format)
  {
    DecimalFormat myFormatter = new DecimalFormat(format);
    String formatValue = myFormatter.format(doubleValue);
    return formatValue;
  }

  public static String encode(String data)
    throws Exception
  {
    byte[] b = Base64.encodeBase64URLSafe(data.getBytes("UTF-8"));

    return new String(b, "UTF-8");
  }

  public static String decode(String data)
    throws Exception
  {
    byte[] b = Base64.decodeBase64(data.getBytes("UTF-8"));

    return new String(b, "UTF-8");
  }

  public static String urlEncode(String source)
  {
    String result = source;
    try {
      result = URLEncoder.encode(source, "UTF-8");
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    return result;
  }

  public static String getFileExt(String contentType)
  {
    String fileExt = "";
    if ("image/jpeg".equals(contentType)) {
      fileExt = ".jpg";
    }
    else if ("audio/mpeg".equals(contentType)) {
      fileExt = ".mp3";
    }
    else if ("audio/amr".equals(contentType)) {
      fileExt = ".amr";
    }
    else if ("video/mp4".equals(contentType)) {
      fileExt = ".mp4";
    }
    else if ("video/mpeg4".equals(contentType)) {
      fileExt = ".mp4";
    }

    return fileExt;
  }

  public static String beanName(Object bean)
  {
    String fullClassName = bean.getClass().getName();
    String classNameTemp = fullClassName.substring(fullClassName.lastIndexOf(".") + 1, fullClassName.length());
    return classNameTemp.substring(0, 1) + classNameTemp.substring(1);
  }

  public static String toLowerCaseFirstOne(String s)
  {
    if (Character.isLowerCase(s.charAt(0))) {
      return s;
    }
    return Character.toLowerCase(s.charAt(0)) + s.substring(1);
  }

  public static String toUpperCaseFirstOne(String s)
  {
    if (Character.isUpperCase(s.charAt(0))) {
      return s;
    }
    return Character.toUpperCase(s.charAt(0)) + s.substring(1);
  }

  public static String camelToUnderline(String param) {
    char UNDERLINE = '_';
    if ((param == null) || ("".equals(param.trim()))) {
      return "";
    }
    int len = param.length();
    StringBuilder sb = new StringBuilder(len);
    for (int i = 0; i < len; ++i) {
      char c = param.charAt(i);
      if (Character.isUpperCase(c)) {
        sb.append(UNDERLINE);
        sb.append(Character.toLowerCase(c));
      } else {
        sb.append(c);
      }
    }
    return sb.toString(); }

  public static String underlineToCamel(String param) {
    char UNDERLINE = '_';
    if ((param == null) || ("".equals(param.trim()))) {
      return "";
    }
    param = param.toLowerCase();
    int len = param.length();
    StringBuilder sb = new StringBuilder(len);
    for (int i = 0; i < len; ++i) {
      char c = param.charAt(i);
      if (c == UNDERLINE) {
        if (++i < len)
          sb.append(Character.toUpperCase(param.charAt(i)));
      }
      else {
        sb.append(c);
      }
    }
    return sb.toString(); }

  public static String underlineToCamel2(String param) {
    if ((param == null) || ("".equals(param.trim()))) {
      return "";
    }
    param = param.toLowerCase();
    StringBuilder sb = new StringBuilder(param);
    Matcher mc = Pattern.compile("_").matcher(param);
    int i = 0;
    while (mc.find()) {
      int position = mc.end() - i++;

      sb.replace(position - 1, position + 1, sb.substring(position, position + 1).toUpperCase());
    }
    return sb.toString(); }

  public static void main(String[] args) {
    String a1 = "userNameConfig,amsAbsUser";
    String a2 = camelToUnderline(a1);
    String a3 = underlineToCamel(a2);
    String a4 = underlineToCamel2(a2);
    String a5 = toUpperCaseFirstOne(a1);
    System.out.println("a1:" + a1);
    System.out.println("a2:" + a2);
    System.out.println("a3:" + a3);
    System.out.println("a4:" + a4);
    System.out.println("a5:" + a5);
  }
}