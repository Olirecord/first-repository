
public class CalcEngine {

	public static void main(String[] args) {
		double[] leftV = {100.0d, 25.0d, 225.0d, 11.0d};
		double[] rightV = {50.0d, 92.0d, 17.0d, 3.0d};
		char [] opCodes = {'a', 's', 'd', 'm'};
		double [] results = new double[opCodes.length];
//		double val1 = 100.0d;
//		double val2 = 7.0d;
//		double result;
//		char opcode = 'd';
		
for(int i = 0; i <opCodes.length; i++)   {
		if(opCodes[i] == 'a')
			results[i] = leftV[i] + rightV[i];
		else if(opCodes[i] == 's')
			results[i] = leftV[i] - rightV[i];
		else if(opCodes[i] == 'd')  {
			results[i] = rightV[i] != 0.0d ? leftV[i] / rightV[i] : 0.0d;					
		} else if(opCodes[i] == 'm')
			results[i] = leftV[i] * rightV[i];
		else {
			System.out.println("Err - Ivalid opCode");
			results[i] = 0.0d;
		}		
}
		for(double theResult : results)
		System.out.println(theResult);
		
		
		
		

	}

}
