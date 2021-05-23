#include<bits/stdc++.h>
using namespace std;
#define ll long long
#define f(i, a, b) for(int i=a; i<b; i++)
#define mod 1000000007
#define sz(a) (int)(a.size())
#define psf push_front
#define ppf pop_front
#define ppb pop_back
#define pb push_back
#define pq priority_queue
#define all(s) s.begin(),s.end()
#define sp(a) setprecision(a)
#define rz resize
#define ld long double
#define inf (ll)1e18


ll ans;
vector<vector<int>> valid;
vector<ll> output, res;
void dfs(int cur, int par)
{
    output[cur]=1, res[cur]=1;
    ll sum = 0, cnt = 0;
    f(i, 0, sz(valid[cur]))
    {
        ll node = valid[cur][i];
        if(node != par)
        {
            dfs(node, cur);
            output[cur]+=((2*output[node])%mod), output[cur]%=mod, cnt++, res[cur]+=res[node], res[cur]%=mod, res[cur]+=output[node], res[cur]%=mod;
            sum += output[node];
        }
    }
    f(i, 0, sz(valid[cur]))
    {
        int node = valid[cur][i];
        if(node != par)
        {
            res[cur] += (output[node]*((sum-output[node]+mod)%mod))%mod;
            res[cur] %= mod;
        }
    }
}

int main()
{
    ios_base::sync_with_stdio(false), cin.tie(NULL);
    int z = 1;
    cin>>z;
    f(i, 1, z+1)
    {
        ans = 0;
        int n;cin>>n;
        valid.rz(n+1), output.rz(n+1), res.rz(n+1);
        f(i, 0, n-1)
        {
            int l, r;
            cin>>l>>r;
            valid[l].pb(r), valid[r].pb(l);
        }
        dfs(1, 1);
        ll ans = res[1]%mod;
        cout<<ans<<endl;
        output.clear(), valid.clear(), res.clear();
    }
}