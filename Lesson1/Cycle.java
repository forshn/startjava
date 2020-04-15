public class Cycle {
	public static void main(String[] args){
for (int i = 0; i < 21; i ++){
	System.out.print(i + " ");
	if (i == 20){
		System.out.println();
	}
	}

int a = -6;
while (a <= 6 && a >=-6){
	System.out.print(a + " ");
	a= a + 2;
}
System.out.println();

int sum = 0;
int j = 10;
do {
		if (j%2 != 0){
	sum +=j;
} j++;
} while (j <= 20);
System.out.println(sum);
}
}

