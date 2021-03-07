int n=sc.nextInt();
		 Object arr[]=new Object[n];
		 String temp;
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 temp=sc.next();
			 if(temp.equals("c"))
			 {
				 arr[i]=new Computer();
			 }
			 else if(temp.equals("d"))
			 {
				 double num=sc.nextDouble();
				 arr[i]=new Double(num);
			 }
			 else if(temp.equals("i"))
			 {
				 int num=sc.nextInt();
				 arr[i]=new Integer(num);
			 }
			 else if(temp.equals("s"))
			 {
				 String str=sc.next();
				 arr[i]=new String(str);
			 }
			 else
			 {
				 arr[i]=null;
			 }
			
		 }
		 for(int i=arr.length-1;i>=0;i--)
		 {
			 if(arr[i]!=null)
			 {
				 System.out.println(arr[i]);
			 }
		 }