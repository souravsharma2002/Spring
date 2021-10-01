// { Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

 // } Driver Code Ends
class Solution{
public:
    int *findTwoElement(int *arr, int n) {
        
        int arr1[n]={0};
        
        for(int i=0;i<n;i++)
        {
            
            int var=arr[i];
            arr1[var]++;
            
        }
        
        for(int i=0;i<n;i++)
        {
            if(arr1[i]==0)
            {
                return arr1[i];
            }
            
            if(arr1[i]==2)
            {
                return arr1[i];
            }
        }
    }
};

// { Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int a[n];
        for (int i = 0; i < n; i++) {
            cin >> a[i];
        }
        Solution ob;
        auto ans = ob.findTwoElement(a, n);
        cout << ans[0] << " " << ans[1] << "\n";
    }
    return 0;
}  // } Driver Code Ends
