package com.base.main;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.base.core.GenerateBase;
import com.base.entity.ConfigInfo;
import com.base.test.TestXmlAndBean;
import com.base.util.FileUtil;

public class CodeBuilderFrame extends JFrame
{
  private static final long serialVersionUID = -7375875438033305934L;
  JLabel lbConfig;
  JButton btnSubmit;
  JTextArea taResult;
  JTextArea taConfig;
  JScrollPane scroll;
  JScrollPane scroll1;
  JScrollBar sBar;
  JScrollBar sBar1;
  GridBagLayout g = new GridBagLayout();
  GridBagConstraints c = new GridBagConstraints();
  private static ConfigInfo configInfo;
  private static String configStr;

  public static void main(String[] args)
  {
    String xmlStr = getXmlStr();
    if ((xmlStr == null) || ("".equals(xmlStr)))
      JOptionPane.showConfirmDialog(null, "请确认'" + FileUtil.getPath() + File.separator + "config" + File.separator + "config.xml" + "'配置文件是否存在", "警告", -1);
    else
      try {
        configInfo = TestXmlAndBean.testXmlToBean(xmlStr);
        configStr = TestXmlAndBean.printConfigInfoToStr(configInfo);
        CodeBuilderFrame localCodeBuilderFrame = new CodeBuilderFrame("yf模版生成器  www.capfyun.com");
      }
      catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, "请确认'" + FileUtil.getPath() + File.separator + "config" + File.separator + "config.xml" + "'配置文件正确性", "警告", -1);
      }
  }

  public static String getXmlStr()
  {
    String fliePath = FileUtil.getPath() + File.separator + "config" + File.separator + "config.xml";
    return FileUtil.readFileToStr(fliePath);
  }

  CodeBuilderFrame(String str)
  {
    super(str);

    setSize(400, 450);
    setResizable(false);
    setDefaultCloseOperation(3);
    setLayout(this.g);

    addComponent();
    setVisible(true);
		setLocationRelativeTo(null);
		try
    {
      Image imgae = ImageIO.read(super.getClass().getResource("/logo.png"));
      setIconImage(imgae);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void addComponent()
  {
    this.lbConfig = new JLabel("读取到的配置：");
    add(this.g, this.c, this.lbConfig, 0, 0, 1, 1);

    this.taConfig = new JTextArea(20, 25);
    this.taConfig.setText(configStr);
    this.taConfig.setLineWrap(true);
    this.scroll1 = new JScrollPane(this.taConfig);
    this.scroll1.setHorizontalScrollBarPolicy(
      31);
    this.scroll1.setVerticalScrollBarPolicy(
      20);
    this.sBar1 = this.scroll1.getVerticalScrollBar();
    add(this.g, this.c, this.scroll1, 0, 1, 2, 1);

    this.btnSubmit = new JButton("生成");
    this.btnSubmit.setToolTipText("点此开始按照模板生成文件");

    add(this.g, this.c, this.btnSubmit, 1, 2, 2, 1);

    this.btnSubmit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String result = new GenerateBase().configInit(CodeBuilderFrame.configInfo);

        JOptionPane.showConfirmDialog(null, result, "提示", -1);

        System.exit(0);
      }
    });
  }

  public void add(GridBagLayout g, GridBagConstraints c, JComponent jc, int x, int y, int gw, int gh)
  {
    c.gridx = x;
    c.gridy = y;
    c.anchor = 17;
    c.gridwidth = gw;
    c.gridheight = gh;
    g.setConstraints(jc, c);
    add(jc);
  }
}