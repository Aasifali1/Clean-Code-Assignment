# Clean-Code-Assignment

### Submitted By: Aasif Ali

## Correct the code according to the Clean Code concepts


**Code is**:

public class B {
static class C {

int a;
int b;
}

static C func1(int arr[], int n) {
C c = new C();
int i;

if (n == 1) {
c.b = arr[0];
c.a = arr[0];
return c;
}

if (arr[0] > arr[1]) {
c.b = arr[0];
c.a = arr[1];
} else {
c.b = arr[1];
c.a = arr[0];
}

for (i = 2; i < n; i++) {
if (arr[i] > c.b) {
c.b = arr[i];
} else if (arr[i] < c.a) {
c.a = arr[i];
}
}

return c;
}

public static void main(String args[]) {
int arr[] = {1000, 11, 445, 1, 330, 3000};
int s = 6;
C c = func1(arr, s);
System.out.printf("\na is %d", c.a);
System.out.printf("\nb is %d", c.b);
}
}
