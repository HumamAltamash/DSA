class BitManipulation {
    public static void main(String[] args) {
		System.out.println(findIthBit(3,1));
    }

    public static int findIthBit(int n,int i) {
		int mask=n>>i;
		if ((n&1)==0)
			return 0;
		else
			return 1;
	}
}