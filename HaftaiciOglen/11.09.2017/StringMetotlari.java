		String str = "yuNANİSTANBULGARİSTAN";
		System.out.println(str.length());
		// length yazının uzunluğunu döner
		System.out.println(str.toUpperCase());
		
		//toUpperCase tüm karakterleri büyük harfe dönüştürür
		System.out.println(str.toLowerCase());
		//toLowerCase tüm karakterleri küçük harfe çevirir
		
		System.out.println(str.charAt(2));
		//charAt int değere göre yazının indisini döner
		
		System.out.println(str.substring(5, 13));
		//substring başlangıç ve bitiş arasındaki metni döner
		
		System.out.println(str.indexOf("İSTAN"));
		//indexOf aranan bulunursa ilk indisi, bulamazsa -1 döner
		
		System.out.println(str.lastIndexOf("İSTAN"));
		//indexOf aranan bulunursa son indisi, bulamazsa -1 döner
		
		//equals