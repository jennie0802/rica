
public class Arr02 {

	public static void main(String[] args) {
		int a1 = 10, a2=10;          //stack 에서의 비교
		System.out.println(a1==a2);
		
		int[] iArr1 = {10,20,30};
		int[] iArr2 = {10,20,30};
		System.out.println(iArr1[0]==iArr2[0]);    // heap에서의 비교
		System.out.println(iArr1==iArr2);
/////////////////////////////////////////////////////
		
		String s1 = "Apple", s2 = "Apple";
		System.out.println(s1==s2);
		String[] sArr1 = {"Apple", "Banana", "Grape"} ;
		String[] sArr2 = {"Apple", "Banana", "Grape"} ;
		System.out.println(sArr1[0]==sArr2[0]);
		System.out.println(sArr1==sArr2);
		System.out.println(sArr1[0]==s1);  //값비교 문제인데. 둘의 주소가 같은가? 정의할 때 순서대로 했으니까. 동일한 Apple을 두고 스택에 주소를 넣엇을 것.ㄴ
		
		
		//이미 s1을 정의할 때 "Apple"은 Heap 영역에서 "Apple"을 정의했다. 그 상태에서 s2, sArr1, sArr2 가 순서대로 정의되니까 다 동일한 "Apple"을 두고 주소를 연결했을 것. 따라서 값비교 상 같은 것이다. 이 heap에 "Apple"이 하나뿐.  
	
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(sArr1[0].hashCode());
        System.out.println(sArr2[0].hashCode());
	
        
        //hashcode는 이를테면 주민번호
        
	
	}

}
