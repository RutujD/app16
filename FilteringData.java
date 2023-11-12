//問題16
/*社員番号と部署名が記述されたファイル EmployeeList.dat から「*開発部」の行を抜き出し画面に表
示するプログラム FilteringData.java を ArrayList クラスの forEach メソ⏿ドとラムダ式を用いて作成し
てください*/
package app16.com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FilteringData {
	 public static void main(String[] args) {
	        String file = ":D//EmployeeList.dat";
	        ArrayList<String> linesContainingDevDept = new ArrayList<>();

	        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
	            bufferedReader.lines()
	                .filter(line -> line.contains("*開発部"))
	                .forEach(linesContainingDevDept::add);

	            linesContainingDevDept.forEach(System.out::println);
	        } catch (IOException e) {
	            System.err.println("ファイルの読み込み中にエラーが発生しました: " + e.getMessage());
	        }
}
}
