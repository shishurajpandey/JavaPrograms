package telusko_mar_2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x=br.readLine();
		System.out.println(x);
		int y=Integer.parseInt(br.readLine());
		double z=Double.parseDouble(br.readLine());
		float w=Float.parseFloat(br.readLine());
		System.out.println(y);
	}

}
