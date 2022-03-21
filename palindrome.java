class palindrome
public static void main(String[] args)
{
    int num =3553, reversedNum = 0, remainder;
    int originalNum = num;
    while (num != 0) {
        remainder = num % 10;
        reversedNum = reversedNum * 10 + remainder;
        num /= 10;
    } 
    if (orginalNum == reversedNum) {
        System.out.println(orginalNum + "is palindrome.");
    }
    else {
        System.out.println(orginalNum + " is not palindrome.");
    }
    
    }
}