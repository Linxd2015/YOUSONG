package cm.tal.test;

import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class TestMain {
	public static void main(String[] args) throws Exception {
		// String[] cmd = { "./cmd.sh", "-c", "$PATH" };
		Process pcs = Runtime.getRuntime().exec("./cmd.sh '$PATH'");
		// ������������Ĵ���Ҳ�����ɹ�shell�ű�
		InputStreamReader ir = new InputStreamReader(pcs.getInputStream());
		LineNumberReader input = new LineNumberReader(ir);
		String line = null;
		while ((line = input.readLine()) != null) {
			System.out.println(line);
		}
		if (null != input) {
			input.close();
		}
		if (null != ir) {
			ir.close();
		}
		int extValue = pcs.waitFor();// ������ 0 ��ʾ�����˳� 1��ʾ�쳣�˳�
	}
}
