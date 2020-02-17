### 배열의 복제(클론)
```
public class CloneArray {
    public static void main(String[] args) throws Exception {

        int[] a = {1,2,3,4,5};
        
        // b는 a의 복제를 참조
        int[] b = a.clone();

        b[3] = 0;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    // [1, 2, 3, 4, 5]
    // [1, 2, 0, 4, 5]
}
```
* clone()을 하게 되면 배열이 복제된다. 
* 여기서 배열 변수 b는 a가 참조하는 배열 본체의 복제를 참조한다.
<br>

### 참조처를 복사
```
public class ArrayParam {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        test(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void test(int[] param) {
        param[2] = 9;
        System.out.println(Arrays.toString(param));
    }

    // [1, 2, 9, 4, 5]
    // [1, 2, 9, 4, 5]
}
```
* 처음에 선언과 동시에 배열 변수 arr가 초기화 되었다.
* 따라서 메서드 test에 전달하는 것은 '배열 본체에 대한 참조'이다.
* 호출한 메서드 test에서는 배열 변수인 매개변수 param이 전달받은 참조로 초기화되므로 배열 변수 param은 배열 test를 참조한다. 
* 그 결과 메서드 test안의 배열 param은 사실상 main 메서드의 배열 arr이다.
* 본체의 복제가 아니라 원래 배열 그 자체를 참조한다는 면에서 clone과 다르다.
<br>

### 오랜만에 접근 제한자
* public : 모든 접근 허용
* protected : 같은 패키지(폴더)의 객체, 상속 관계의 객체 허용
* default : 같은 패키지(폴더)의 객체 허용
* private : 현재의 객체 안에서만 허용