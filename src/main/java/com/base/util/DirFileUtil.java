package com.base.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DirFileUtil
{
  public static String getLineNumber()
  {
    StackTraceElement ste = new java.lang.Throwable().getStackTrace()[1];
    return ste.getFileName() + ": Line " + ste.getLineNumber();
  }

  public static List<String> getDirFileNames(String dirPath)
  {
    List nameList = new ArrayList();
    File file = new File(dirPath);
    File[] files = file.listFiles();
    for (File fileTemp : files) {
      if (!(fileTemp.isDirectory())) {
        nameList.add(fileTemp.getName());
      }
    }
    return nameList;
  }

  public static List<String> getDirsNames(String dirPath)
  {
    List nameList = new ArrayList();
    File file = new File(dirPath);
    File[] files = file.listFiles();
    for (File fileTemp : files) {
      if (fileTemp.isDirectory()) {
        nameList.add(fileTemp.getName());
      }
    }
    return nameList;
  }

  public static void copyDir(String source, String target)
    throws IOException
  {
    new File(source).mkdirs();

    File[] file = new File(source).listFiles();
    for (int i = 0; i < file.length; ++i) {
      if (file[i].isFile())
      {
        copyFile(file[i], new File(target + file[i].getName()));
      }
      if (!(file[i].isDirectory()))
        continue;
      String sourceDir = source + File.separator + file[i].getName();
      String targetDir = target + File.separator + file[i].getName();
      copyDirectiory(sourceDir, targetDir);
    }
  }

  public static void lovecopy(String source, String target)
  {
    File f = new File(target);
    if (!(f.exists())) {
      f.mkdirs();
    }

    File[] file = new File(source).listFiles();
    for (int i = 0; i < file.length; ++i) {
      if (file[i].isFile()) {
        try
        {
          copyFile(file[i], new File(target + file[i].getName()));
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (!(file[i].isDirectory()))
        continue;
      String sourceDir = source + File.separator + file[i].getName();
      String targetDir = target + File.separator + file[i].getName();
      try {
        copyDirectiory(sourceDir, targetDir);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public static void copyFile(File sourceFile, File targetFile)
    throws IOException
  {
    FileInputStream input = new FileInputStream(sourceFile);
    BufferedInputStream inBuff = new BufferedInputStream(input);

    FileOutputStream output = new FileOutputStream(targetFile);
    BufferedOutputStream outBuff = new BufferedOutputStream(output);

    byte[] b = new byte[5120];
    int len;
    while ((len = inBuff.read(b)) != -1) {
      outBuff.write(b, 0, len);
    }

    outBuff.flush();

    inBuff.close();
    outBuff.close();
    output.close();
    input.close();
  }

  public static void copyDirectiory(String sourceDir, String targetDir)
    throws IOException
  {
    new File(targetDir).mkdirs();

    File[] file = new File(sourceDir).listFiles();
    for (int i = 0; i < file.length; ++i) {
      if (file[i].isFile())
      {
        File sourceFile = file[i];

        File targetFile = new File(new File(targetDir).getAbsolutePath() + File.separator + file[i].getName());
        copyFile(sourceFile, targetFile);
      }
      if (!(file[i].isDirectory()))
        continue;
      String dir1 = sourceDir + File.separator + file[i].getName();

      String dir2 = targetDir + File.separator + file[i].getName();
      copyDirectiory(dir1, dir2);
    }
  }

  public static void createDirectory(String dirPath)
  {
    File file = new File(dirPath);
    if (!(file.exists()))
      file.mkdirs();
  }

  public static boolean delete(File file)
  {
    boolean reStatus = false;
    if ((file != null) && (file.exists())) {
      if (file.isDirectory()) {
        File[] files = file.listFiles();
        int i = 0; for (int length = files.length; i < length; ++i) {
          reStatus = delete(files[i]);
        }
      }
      reStatus = file.delete();
    }
    return reStatus;
  }

  public static void createFile(String savePath, String content)
  {
    try
    {
      File file = new File(savePath);
      BufferedWriter output = new BufferedWriter(new FileWriter(file));
      output.write(content);
      output.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args)
    throws IOException
  {
  }
}