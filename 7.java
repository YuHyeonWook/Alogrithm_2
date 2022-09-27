package com.fastcampus.ch2;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		//값을 입력받기 위한 BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//나이트의 위치를 우선 문자열로 받는 nightPos
		String nightPos = br.readLine();
		//string 객체가 있을때 charAt()를 이용해서 특정한 문자 인덱스를 가져올 수 있다.
		int row = nightPos.charAt(1) - '0'; //나이트의 현재 위치의 행 row
		int col = nightPos.charAt(0) - 'a' + 1; //나이트의 현재 위치의 행 col
		//나이트의 이동계산을 위한 dx[ ], dy[ ]
		int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
		int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
		//경우의 수를 위한 count
		int count = 0;

		for (int i = 0; i < 8; i++) {
			// 이동하고자 하는 위치 확인
			int nextRow = row + dx[i];
			int nextColumn = col + dy[i];
			// 해당 위치로 이동이 가능하다면 카운트 증가.
			if (( nextRow >=1 && nextRow <= 8) &&  (nextColumn >= 1 && nextColumn <= 8)) {
				count += 1;
			}

		}
		System.out.println("count = " + count);
	}
}
