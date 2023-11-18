/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution
{
	public:
    vector<int> pv, qv;	
	void ans(TreeNode *q,vector<int> &pv)
	{
		if (q == nullptr)
		{
			pv.push_back(INT_MIN);
			return;
		}
        
        pv.push_back(q->val);
		ans(q->left , pv);
		ans(q->right, pv);
	}

	bool isSameTree(TreeNode *p, TreeNode *q)
	{
		ans(q,qv);
		ans(p,pv);
		
		if (pv.size() != qv.size()) return false;
		for (int i = 0; i < pv.size(); i++)
		{
			if (pv[i] != qv[i]) return false;
		}

		return true;
	}
};