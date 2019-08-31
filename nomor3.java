public class segitiga{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan Panjang Alas/tinggi : ");
		int n = sc.nextInt();

		if(n<0||n>10){
			System.out.print("0 < Alas/Tinggi < 10");
		}else{
			for (int i=1;i<=n ;i++ ) {
				for (int j=0;j<i ;j++ ) {
					int prima[] ={2,3,5,7,11,13,17,19,23,29};
					System.out.print(prima[j]);
				}
				System.out.println();
			}
		}

	}
}