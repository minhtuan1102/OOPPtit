#include <bits/stdc++.h>
using namespace std;
const long mod = 1e9+7;
int main()
{
    long a,b;
    cin >> a >> b;
    cout << (pow(2,a)%mod + pow(3,b)%mod);
    return 0;
}
 