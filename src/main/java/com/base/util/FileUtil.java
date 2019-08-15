package com.base.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	public static void main(String[] args) {
		String path = getPath();

		System.out.println(path);

		String path1 = getPath1();
		System.out.println(path1);
	}

	public static void appendToFile(String fliePath, String Str) {
		File log = new File(fliePath);
		try {
			if (!(log.exists())) {
				File parentDir = new File(log.getParent());
				if (!(parentDir.exists())) {
					parentDir.mkdirs();
				}
				log.createNewFile();
			} else {
				Str = readFileToStr(fliePath) + "\r\n" + Str;
			}
			createToFile(fliePath, Str);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public static void createToFile(String fliePath, String Str) {
		File log = new File(fliePath);
		try {
			if (!(log.exists())) {
				File parentDir = new File(log.getParent());
				if (!(parentDir.exists()))
					parentDir.mkdirs();
			}
			log.createNewFile();
			FileOutputStream fos = new FileOutputStream(log);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			osw.write(Str);
			osw.flush();
			osw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public static List<String> readFileToList(String fliePath) {
		List list = new ArrayList();
		try {
			String encoding = "GBK";
			File file = new File(fliePath);
			if ((file.isFile()) && (file.exists())) {
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					list.add(lineTxt);
				}
				read.close();
			} else {
				System.out.println("找不到指定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}
		return list;
	}

	public static String readFileToStr(String fliePath) {
		StringBuffer context = new StringBuffer();
		try {
			String encoding = "UTF-8";
			File file = new File(fliePath);
			if ((file.isFile()) && (file.exists())) {
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					context.append(lineTxt);
				}
				read.close();
			} else {
				System.out.println("找不到指定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}
		return context.toString();
	}

	public static String getPath() {
		String filePath = System.getProperty("java.class.path");
		String pathSplit = System.getProperty("path.separator");

		if (filePath.contains(pathSplit))
			filePath = filePath.substring(0, filePath.indexOf(pathSplit));
		else if (filePath.endsWith(".jar")) {
			filePath = filePath.substring(0, filePath.lastIndexOf(File.separator));
		}

		return filePath;
	}

	public static String getPath1() {
		URL url = FileUtil.class.getProtectionDomain().getCodeSource().getLocation();
		String filePath = null;
		try {
			filePath = URLDecoder.decode(url.getPath(), "utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (filePath.endsWith(".jar")) {
			filePath = filePath.substring(0, filePath.lastIndexOf("/") + 1);
		}

		File file = new File(filePath);

		filePath = file.getAbsolutePath();
		return filePath;
	}
	
	public static String getProjectRootPath(){
		String path = System.getProperty("user.dir");
		return path;
	}

	public void createReadMeAndDemo() {
	}
}