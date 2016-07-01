//package CALCULATOR;                            
import java.lang.Math;
import java.math.MathContext;
import java.util.Scanner;

public class Calc 
{   
	static double a,b,c,o,p,q,si;
	static int n,m1,km1;
	static long m,v,fact=1;
	static float f,ce;
	 
 static void ADD()
	{
	  System.out.println("TO ADD ANY NO."); 
	  Scanner s=new Scanner(System.in);
	  System.out.println("HOW MANY NO. DO YOU WANT TO add?");
	  n=s.nextInt();
	  System.out.println("ENTER ALL " +n+" NUMBERS");
		
	  double sum=0;
	  for(int i =0 ; i<n ;i++)
	  {
	  a= s.nextDouble();
	  sum=sum+a;
	  }
	  System.out.println(sum);
	}
 static void SUBTRACT()
	{
	  System.out.println("TO SUBTRACT ANY NO."); 
	  Scanner s=new Scanner(System.in);
	  System.out.println("HOW MANY NO. DO YOU WANT TO SUBTRACT?");
	  n=s.nextInt();
	  System.out.println("ENTER ALL " +n+" NUMBERS");
		
	  double sub=0;
	  for(int i =0 ; i<n ;i++)
	  {
	   a= s.nextDouble();
	  if(i==0)
	   sub=a-sub;
	    else
		sub=sub-a;
	  }
	  System.out.println("ANS is="+sub);
	 }

 static void MULTIPLY()
	{
	  System.out.println("TO MULTIPLY ANY NO."); 
	  Scanner s=new Scanner(System.in);
	  System.out.println("HOW MANY NO. DO YOU WANT TO MULTIPLY?");
	  n=s.nextInt();
	  System.out.println("ENTER ALL " +n+" NUMBERS");
		
	  double mul=1;
	  for(int i =0 ; i<n ;i++)
	  {
	   a= s.nextDouble();
	  if(i==0)
		mul=a*mul;
	  else
		mul=mul*a;
		}
		System.out.println("ANS is="+mul);
	}
 static void DIVIDE()
	{
	  System.out.println("TO DIVIDE ANY NO."); 
	  Scanner s=new Scanner(System.in);
	  System.out.println("HOW MANY NO. DO YOU WANT TO DIVIDE.?");
	  n=s.nextInt();
	  System.out.println("ENTER ALL " +n+" NUMBERS");
		
	  double div=1;
	  for(int i =0 ; i<n ;i++)
	  {
	   a= s.nextDouble();
	  if(i==0)
		  div=a/div;
	  else
		  div=div/a;
		}
		System.out.println("ANS is="+div);
	} 
 static void PERCENTAGE()
	{
	  System.out.println("TO FIND PERCENTAGE OF ANY NO."); 
	  Scanner s=new Scanner(System.in);
	  System.out.println("ENTER a and n where a=percentage &THEN ENTER n=TOTAL NUMBER?");
	  a=s.nextDouble();
	  n=s.nextInt();
	
      double per=1;
	   per= (a/100)*n;
	  System.out.println("ANS is="+per);
	}
 static void FACTORIAL()
 {
	 System.out.println("TO FIND FACTORIAL OF ANY NO"); 
	 Scanner s=new Scanner(System.in);
	 System.out.println("ENTER ANY NO. FOR ITS FACTORIAL");
	  //a=s.nextDouble();
	  n=s.nextInt();
	 //m=v;
	while(n>0)
	 {
	   fact*=n;
	   n--;			
	 }
	  System.out.println("FACTORIAL = " +fact);
  }
  static void power()
  {
	 System.out.println("TO FIND POWER OF ANY NO"); 
	 Scanner s=new Scanner(System.in);
	 System.out.println("ENTER THE NO. WHOSE POWER YOU WANT TO CALCULATE");
	 o=s.nextDouble();
	 System.out.println("ENTER THE POWER");
			p=s.nextInt();
			q=Math.pow(o,p);
			System.out.println("ans is"+q);
  }
  static void sqrt()
  {
	 System.out.println("TO FIND sqrt OF ANY NO"); 
	 Scanner s=new Scanner(System.in);
	 System.out.println("ENTER THE NO. WHOSE sqrt YOU WANT TO CALCULATE");
	 o=s.nextDouble();
		//System.out.println("ENTER THE sqrt");
		//p=s.nextInt();
		if(o>0)
		{
		q=Math.pow(o,0.5);
		System.out.println("ans is"+q);
		}
		else{
			 q=Math.pow(-o,0.5);
			 System.out.println("ans is"+q+"i");
			}
 }
 //---------------------------------------------------------------------------------------------------------------------------
 static void sine()											 
 {
			System.out.println("ENTER VALUE TO GET sin");
			Scanner s=new Scanner(System.in);
			double si=s.nextDouble();
			//si=(22*si)/(180*7);
			p=Math.sin(Math.toRadians(si));
			System.out.println("sin("+si+")=  "+p);
			}
 static void cos()												
 {
			 System.out.println("ENTER VALUE TO GET  cos");
			 Scanner s=new Scanner(System.in);
			 double si=s.nextDouble();
			//si=(22*si)/(180*7);
			p=Math.cos(Math.toRadians(si));
			System.out.println("cos("+si+")=  "+p);
			}
 static void tan()											
 {
		     System.out.println("ENTER VALUE TO GET  tan");
			 Scanner s=new Scanner(System.in);
			 double si=s.nextDouble();
			//si=(22*si)/(180*7);
			 p=Math.tan(Math.toRadians(si));
			 System.out.println("tan("+si+")=  "+p);
}
 static void cosec()												
 {
				 System.out.println("ENTER VALUE TO GET  cosec");
				 Scanner s=new Scanner(System.in);
			     double si=s.nextDouble();
			//si=(22*si)/(180*7);
			     p=1/Math.sin(Math.toRadians(si));
			     System.out.println("sin("+si+")=  "+p);
 }
 static void sec()												
 {
			 System.out.println("ENTER VALUE TO GET  sec");
			 Scanner s=new Scanner(System.in);
			 double si=s.nextDouble();
			//si=(22*si)/(180*7);
			p=1/Math.cos(Math.toRadians(si));
			System.out.println("cos("+si+")=  "+p);
 }
 static void cot()										
 {
			 System.out.println("ENTER VALUE TO GET  cot");
			 Scanner s=new Scanner(System.in);
			 double si=s.nextDouble();
			//si=(22*si)/(180*7);
			p=1/Math.tan(Math.toRadians(si));
			System.out.println("tan("+si+")=  "+p);
 }
 //------------------------------------------------------------------------------------------------------------inverse of....
 static void asine()											 
 {
		      System.out.println("ENTER VALUE TO GET  asin");
			  Scanner s=new Scanner(System.in);
			  double si=s.nextDouble();
			  p=Math.asin(si);
			//si=(22*si)/(180*7);
              p=Math.toDegrees(p);
              String.format("%.2f", p);
			  System.out.println("asin("+si+")=  "+p);
 }
 
 static void acos()												
 {
			  System.out.println("ENTER VALUE TO GET  acos");
			  Scanner s=new Scanner(System.in);
			  double si=s.nextDouble();
			  p=Math.acos(si);
			//si=(22*si)/(180*7);
			  p=Math.toDegrees(p);
			  System.out.println("acos("+si+")=  "+p);
 }
 
 static void atan()											
 {
			  System.out.println("ENTER VALUE TO GET  atan");
			  Scanner s=new Scanner(System.in);
			  double si=s.nextDouble();
			  //si=(22*si)/(180*7);
			  p=Math.atan(si);
			  p=Math.toDegrees(p);
			  System.out.println("tan("+si+")=  "+p);
 }
 
 static void acosec()												
 {
			  System.out.println("ENTER VALUE TO GET  acosec");
			  Scanner s=new Scanner(System.in);
			  double si=s.nextDouble();
			  //si=(22*si)/(180*7);
			  p=Math.asin(1/si);
		      p=Math.toDegrees(p);
			  System.out.println("cosec("+si+")=  "+p);
  }
 
 static void asec()												
 {
	   		 System.out.println("ENTER VALUE TO GET  asec");
			 Scanner s=new Scanner(System.in);
    		 double si=s.nextDouble();
		 	//si=(22*si)/(180*7);
			 p=Math.acos(1/si);
			 p=Math.toDegrees(p);
			 System.out.println("sec("+si+")=  "+p);
 }
 
 static void acot()										
 {
		     System.out.println("ENTER VALUE TO GET  acot");
		     Scanner s=new Scanner(System.in);
			 double si=s.nextDouble();
			//si=(22*si)/(180*7);
			 p=Math.atan(1/si);
			 p=Math.toDegrees(p);
			 System.out.println("acot("+si+")=  "+p);
 }

 
 //------------------------------------------------------------------------------------------------------------
 static void log10()												
 {
		     System.out.println("ENTER VALUE TO GET  log");
			 Scanner s=new Scanner(System.in);
		     double si=s.nextDouble();
		    //si=(22*si)/(180*7);
		     p=Math.log10(si);
	         System.out.println("log("+si+")=  "+p);
 }

 static void ln()												
 {
			 System.out.println("ENTER VALUE TO GET  log");
		     Scanner s=new Scanner(System.in);
	         double si=s.nextDouble();
			//si=(22*si)/(180*7);
			 p=Math.log(si);
			 System.out.println("log("+si+")=  "+p);
 }
 
	//_________________________________________________________________________________________________________________________________
 private static void MMUL() 
 {
		// TODO Auto-generated method stub
		int r1,c1,r2,c2;
		Scanner s= new Scanner(System.in);
		System.out.println("\n ENTER ORDER OF 1st MATRIX:ROW X COLUM N\n");
	    r1=s.nextInt();
	    c1=s.nextInt();
	    System.out.println("\n ENTER ORDER OF 2st MATRIX:ROW X COLUM M\n");
	    r2=s.nextInt();
	    c2=s.nextInt();
	     if(c1!=r2)
		    {
		      System.out.println("multiplication not possible");
	
		      return;
		    }
		 double a[][]=new double[r1][c1],b[][]=new double[r2][c2],c[][]=new double[r1][c2];
		 System.out.println("ENTER ELEMENTS OF 1st MAT=");
		 for(int i=0;i<r1;i++)
		 {
		      for(int j=0;j<c1;j++)
		   {
		    System.out.println("enter a["+i+"]["+j+"]= ");
		    a[i][j]=s.nextDouble();
		   }
		 }
		 System.out.println("ENTER ELEMENTS OF 2st MAT=");
		      for(int i=0;i<r2;i++)
		   {
		     for(int j=0;j<c2;j++)
		     {
		       System.out.println("enter b["+i+"]["+j+"]= ");
		       b[i][j]=s.nextDouble();
		     }
		   }
		 for(int i=0;i<r1;i++)
		 {
		   for(int j=0;j<c2;j++)
		   {
		    c[i][j]=0;
		    for(int k=0;k<c1;k++)
		    {
		      c[i][j]=c[i][j]+a[i][k]*b[k][j];
		    }
		   }
		 }
		 System.out.println("multiplication=\n");
		 for(int i=0;i<r1;i++)
		 {
		    for(int j=0;j<c2;j++)
		     {
                System.out.print(c[i][j]+"\t");
		     }
		  System.out.println("\n");
		 }
		
    	}
	public static void matadd()
	{
		int r1,c1,r2,c2;
		Scanner s= new Scanner(System.in);
		 System.out.println("\n ENTER ORDER OF 1st MATRIX:ROW X COLUM N\n");
		 r1=s.nextInt();
		 c1=s.nextInt();
		 System.out.println("\n ENTER ORDER OF 2st MATRIX:ROW X COLUM M\n");
		 r2=s.nextInt();
		 c2=s.nextInt();
		 if(r1!=r2&&c1!=c2)
		 {
			 System.out.println("MATRIX ADDITION IS NOT POSSIBLE");
			 return;
		 }
		 double a[][]=new double[r1][c1],b[][]=new double[r2][c2],c[][]=new double[r1][c2];
		 System.out.println("ENTER ELEMENTS OF 1st MAT=");
		 for(int i=0;i<r1;i++)
		 {
		  for(int j=0;j<c1;j++)
		  {
		   // c[i][j]=a[i][j]+b[i][j]	; 
				System.out.println("enter a["+i+"]["+j+"]= ");
		        a[i][j]=s.nextDouble();
		  }
		  }
		 System.out.println("ENTER ELEMENTS OF 2st MAT=");
		 for(int i=0;i<r1;i++)
		 {
		  for(int j=0;j<c1;j++)
		  {
		   // c[i][j]=a[i][j]+b[i][j]	; 
				System.out.println("enter b["+i+"]["+j+"]= ");
		        b[i][j]=s.nextDouble();
		  }
		  }	
		 for(int i=0;i<r1;i++)
		 {
		  for(int j=0;j<c1;j++)
		  {
		    c[i][j]=a[i][j]+b[i][j]	; 
			//	System.out.println("enter a["+i+"]["+j+"]= ");
		      //  a[i][j]=s.nextDouble();
		  }
		  }	
		
		 System.out.println("\nThe sum is: ");
		 for(int k=0; k<r1; k++)
		 {
			 for(int l=0; l<c1; l++)
			 {
				 System.out.print(c[k][l]+"\t");
			 }
		 System.out.println();
		 }
		 
	}
		//(------------------------------------------------------------------------------------------------------------------------) 
		 
	public static void matsub()
	{
		int r1,c1,r2,c2;
		Scanner s= new Scanner(System.in);
		 System.out.println("\n ENTER ORDER OF 1st MATRIX:ROW X COLUM N\n");// ENTER ORDER OF 1st MATRIX:ROW X COLUM N
		 r1=s.nextInt();
		 c1=s.nextInt();
		 System.out.println("\n  ENTER ORDER OF 2st MATRIX:ROW X COLUM M\n");
		 r2=s.nextInt();
		 c2=s.nextInt();
		 if(r1!=r2&&c1!=c2)
		 {
			 System.out.println("MATRIX substraction IS NOT POSSIBLE");
			 return;
		 }
		 double a[][]=new double[r1][c1],b[][]=new double[r2][c2],c[][]=new double[r1][c2];
		 System.out.println("ENTER ELEMENTS OF 1st MAT=");
		 for(int i=0;i<r1;i++)
		 {
		  for(int j=0;j<c1;j++)
		  {
		   // c[i][j]=a[i][j]+b[i][j]	; 
				System.out.println("enter a["+i+"]["+j+"]= ");
		        a[i][j]=s.nextDouble();
		  }
		  }
		 System.out.println("ENTER ELEMENTS OF 2st MAT=");
		 for(int i=0;i<r1;i++)
		 {
		  for(int j=0;j<c1;j++)
		  {
		   // c[i][j]=a[i][j]+b[i][j]	; 
				System.out.println("enter b["+i+"]["+j+"]= ");
		        b[i][j]=s.nextDouble();
		  }
		  }	
		 for(int i=0;i<r1;i++)
		 {
		  for(int j=0;j<c1;j++)
		  {
		    c[i][j]=a[i][j]-b[i][j]	; 
			//	System.out.println("enter a["+i+"]["+j+"]= ");
		      //  a[i][j]=s.nextDouble();
		  }
		  }	
		
		 System.out.println("\nThe sum is: ");
		 for(int k=0; k<r1; k++)
		 {
			 for(int l=0; l<c1; l++)
			 {
				 System.out.print(c[k][l]+"\t");
			 }
		 System.out.println();
		 }
		 
	}
//____________________________________________________________________________________________________________________________________--		 
		 
		public static void Circle()
			 {
				 Scanner s= new Scanner(System.in);
			 System.out.println("ENTER THE AREA OF CIRCLE");
			 double r=s.nextDouble();
			 System.out.println("AREA OF CIRCLE ="+(3.14*r*r));
			 }
		public static void Cylinder()
			 {
				 Scanner s= new Scanner(System.in);
			 System.out.println("ENTER THE RADIUS AND HEIGHT OF CYLINDER ");
			 double r=s.nextDouble();
			 double h=s.nextDouble();
			 System.out.println("Area OF CYLINDER ="+((2*3.14*r*r)+(2*3.14*r*h)));
			 }
		public static void Rectangle()
			 {
				 Scanner s= new Scanner(System.in);
			 System.out.println("Enter THE LENGTH AND BREADTH ");
			 double l=s.nextDouble();
			 double b=s.nextDouble();
			 System.out.println("AREA OF RECTANGLE ="+(l*b));
			 }
		public static void  Square()
			 {
				 Scanner s= new Scanner(System.in);
			 System.out.println("ENTER THE SIDE OF SQUARE");
			 double l=s.nextDouble();
			 System.out.println("AREA OF CYLINDER ="+(l*l));
			 }
		 
		 
			 
		 

			 
			 
	//(----------------------------------------------------------------------------------------------------)		 
	
	public static void  Meter_to_Kmeter()
	{
		System.out.print("ENTER THE VALUES IN METERS: ");
	     Scanner s1= new Scanner(System.in);
	     m1=s1.nextInt();
	     
	int n= m1/1000;
	System.out.println("THE DISTANCE IN KILOMETER IS: "+n+"km");	
	}
	public static void Kmeter_to_Meter()
	{
		System.out.print("ENTER THE VALUES IN KILOMETERS: ");
    Scanner s2= new Scanner(System.in);
    km1=s2.nextInt();
    int n= km1*1000; 
    System.out.println("THE DISTANCE IN KILOMETER IS: "+n+"m");
	
	}
	public static void  C_to_F()
	{
		System.out.print("ENTER THE VALUES IN CELCIUS: ");
	    Scanner s3= new Scanner(System.in);
	    ce=s3.nextFloat();
	    double n=(c*1.8+32);
	 System.out.println("The TEMPRATURE IN FAHRENHEIT IS: "+n+"°F");
	}
	public static void F_to_C()
	{
		System.out.print("ENTER THE VALUES IN FAHRENHEIT: ");
	     Scanner s4= new Scanner(System.in);
	     f=s4.nextFloat();
	     double n=f-32/1.8;
	     System.out.println("The TEMPRATURE in CELCIUS  is: "+ce+"°C");
	
	}
	
	
 
 
 
 
 
	public static void main(String[] args)
{
		double a,p;
		Calc o=new Calc();
		int xc;
		char c='y';
		while(c=='y'|| c=='Y')
		{
		
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("\t\t\t\t\t\t\t\t-:WELCOME IN THE CALCULATOR:-");
		System.out.println("\n   MENU:-");
		System.out.println("\n\t1.ARITHMATIC\n\t2.TRIGNOMETRY\n\t3.MATRIX\n\t4.LOGARITHM\n\t5.EQUATIONN\n\t6.CONVERSION\n\t7.AREA");
		
	//
		System.out.println("\nENTER YOUR CHOISE :-"); 
		
	    xc=s.nextInt();
	    System.out.println("_______________________________________________________________________________________________________");
	   //System.out.println("c="+c);
	     switch (xc) {
		case 1:System.out.println("\nCHOOSE THE OPERATION THAT YOU WANT TO PERFORM:-");
		System.out.println("\t1.ADD\n\t 2.Sub\n\t 3.MULTIPLY \n\t 4.DIVIDE\n\t 5.PERCENTAGE\n\t 6.FACTORIAL\n\t 7.SQUUAREROOT\n\t 8.POWER ");
		xc=s.nextInt();
		switch (xc) {
		case 1:
			ADD();
			break;

		case 2:SUBTRACT();
			break;
		case 3:MULTIPLY();
			break;
		case 4:DIVIDE();
			break;
		case 5:PERCENTAGE();
			break;
	   case 6:FACTORIAL();
			break;		 
			case 7:sqrt();
		  break;
		case 8:power();
			break;

		}
			break;

		case 2:System.out.println("CHOOSE THE OPERATION THAT YOU WANT TO PERFORM:-");
		System.out.println("\n\t1. sin\n\t2. cos\n\t3. tan\n\t4. cosec\n\t5. sec\n\t6. cot\n\t7. sin inverse\n\t8. cos inverse\n\t9. tan inversen\t10. cosec inverse\n\t11. sec inverse\t12. cot inverse");
		xc=s.nextInt();
	     switch (xc) {	 	
			case 1:sine();
			break;
			case 2:cos();
			break;
			case 3:tan();
			break;
			case 4:cosec();
			break;
			case 5:sec();
			break;
		    case 6:cot();
		    break;
		    case 7:asine();
		    break;
		    case 8:acos();
		    break;
		    case 9:atan();
		    break;
		    case 10:acosec();
			break;
			case 11:asec();
			break;
	        case 12:acot();
		    break; 
	     }
		
			break;
		case 3:System.out.println("CHOOSE THE OPERATION THAT YOU WANT TO PERFORM\n");
		System.out.println("\n\t1. metrux multiplication\n\t2. addition of metrix\n\t3. subtraction of matrix");
		xc=s.nextInt();
	     switch (xc) {
	   
		 case 1:MMUL();
		 break;
		 case 2:matadd();
		 break;
		 case 3:matsub();
		 break;
	     }
	     break;
		case 4:System.out.println("CHOOSE THE OPERATION THAT YOU WANT TO PERFORM\n");
		System.out.println("\n\t1.log()\n\t2. ln()");
		xc=s.nextInt();
	     switch (xc) {
	     case 1:log10();
		 break;
		 case 2:ln();
		 break;
	     }
	     break;
		case 6:System.out.println("CHOOSE THE OPERATION THAT YOU WANT TO PERFORM\n");
		System.out.println("\t\tconversions");
		System.out.println("\n\t1.Meter to Kmeter\n\t2.Kmeter to Meter\n\t3.Celcius to Farenhiet\n\t4.Farenhiet to Celcius");
		xc=s.nextInt();
	     switch (xc) 
	     {
	     case 1:Meter_to_Kmeter();
	         	 break;
	     case 2: Kmeter_to_Meter();
	    	     break;
	     case 3: C_to_F();	    	 
		         break;
	     case 4:F_to_C();  
		     	 break;
	     }
		case 7: System.out.println("CHOOSE THE OPERATION THAT YOU WANT TO PERFORM\n");  
		       System.out.println("MENU TO FIND AREA:-\n\t1.Circle\n\t2.Cylinder\n\t3.Rectangle\n\t4.Square");
		       int ch=s.nextInt();
		 switch(ch)
		 {
		 case 1:Circle();
			   break;
		 case 2:Cylinder();
			   break;
		 case 3:Rectangle();
			   break;
		 case 4:Square();
		       break;
		/*default: System.out.println("DO YOU WANT TO CONTINUE=");
		        c=s.next().charAt(0);
		        break;*/
		}
	     } 
		System.out.println("Do YOU WANT TO CONTINUE..?(Y/N)!");
		
		c=s.next().charAt(0);
	}
		     System.out.println(" ::THANKYOU FOR USING:: ");
		}

}	

