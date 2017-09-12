/*
		int sayi1 = 30;
		int sayi2 = 5;
		
		if(sayi1>sayi2){
			System.out.println("Sayı1:"+sayi1+" sayı2:"+sayi2+"'den büyüktür.");
		}else if(sayi1==sayi2){
			System.out.println("Sayılar eşittir");
		}else{
			System.out.println("Sayı1:"+sayi1+" sayı2:"+sayi2+"'den küçüktür.");
		}
*/
		
		
/*
		String user = "admin";
		String pass = "1234";
		Scanner sc = new Scanner(System.in);
		System.out.println("Kullanıcı adı giriniz");
		String kullaniciAdi = sc.nextLine();
		System.out.println("Şifre giriniz");
		String sifre = sc.nextLine();
		
		if(user.equals(kullaniciAdi) && pass.equals(sifre)){
			System.out.println("Hoşgeldin admin");
		}else{
			System.out.println("Seni tanımıyorum");
		}
*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen mevsim giriniz (sonbahar,kış,ilkbahar,yaz");
		String mevsim = sc.next();		
		
		if("sonbahar".equals(mevsim)){
			System.out.println("Eylül,ekim,kasım");
		}else if("kış".equals(mevsim)){
			System.out.println("Aralık,ocak,şubat");
		}else if("ilkbahar".equals(mevsim)){
			System.out.println("Mart,nisan,mayıs");
		}else if("yaz".equals(mevsim)){
			System.out.println("Haziran,temmuz,ağustos");
		}else{
			System.out.println("Böyle bir mevsim yok");
		}