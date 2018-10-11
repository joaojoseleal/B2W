
public class Solution {
	
	public static void main(String[] args) {
		if (args.length > 0) {
			int n = Integer.valueOf(args[0]);
			System.out.println(solution(n));
		} else {
			System.out.println("Informe um numero como argumento.");
		}
	}
	
	/**
	 * Incompleta, falta remover os zeros.
	 * @param n
	 * @return
	 */
	private static int solution(int n) {
		String nStr = String.valueOf(n);
		int countZeros = (int) nStr.chars().filter(c -> c == '0').count();
		int r = fatorial(nStr.length());
		if (countZeros > 0) {
			r = r - ((nStr.length() - 1) * countZeros);
		}
		return r;
	}
	
	private static int fatorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return fatorial(n - 1) * n;
		}
	}

}
