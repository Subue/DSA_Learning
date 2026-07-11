#include <iostream>
using namespace std;

int main() {
    int a, b, c, d;

    a = (4 > 6);
    cout << a << endl;

    b = (3 < 5);
    cout << b << endl;

    c = (2 <= 2);
    cout << c << endl;

    d = (3 >= 4);
    cout << d << endl;

    cout << (b == c) << endl;
    cout << (c != a) << endl;

    return 0;
}