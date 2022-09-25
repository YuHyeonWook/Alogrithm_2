package com.fastcampus.ch2;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());  // 어떠한 수
		int k = Integer.parseInt(st.nextToken()); // 나누는수 k
		int count =0;  // 연산 횟수 보여주게함


		// 1. n이 k의 배수가 될 떄까지 1씩 빼기
		// 2. n을 k로 나누기
		while(n != 1) { // n이 1이면 while 중단함
			if(n % k == 0) { //k가 n의 배수이면 true
 				n /=k; // n을 k로 나눠서 그 몫을 n에 저장함
				count++; // 연산횟수 저장
			} else {
				n -= 1; // k가 n의 배수가 아니면 false
				count++; // 연산횟수 저장
			}
		}
		System.out.println("count = " + count);
		
	}
}
