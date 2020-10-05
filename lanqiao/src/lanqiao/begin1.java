package lanqiao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class begin1 {
	public static int arr[] = new int[1000005];
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		arr[1] = arr[2] = 1;
		for(int i=3;i<1000004;i++) {
			arr[i] = arr[i-1]+arr[i-2]%1000007;
		}
		System.out.println(arr[n]);
	}
}
 