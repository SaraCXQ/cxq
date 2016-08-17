package com.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class test5 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BiTree tree = new BiTree(2);
        //tree.store(3);
        //tree.store(1);
        //tree.store(4);
        //tree.store(6);
        
        //BiTree tree1 = new BiTree(1);
        //BiTree tree2 = new BiTree(4);
        
        //System.out.println("二叉树中相距最远的两个结点之间的距离"+ tree.GetMaxDistance(tree));
        //System.out.print(tree.GetLastCommonParent(tree, tree1, tree2));
        
        //tree.store(4);
        //tree.store(3);
       // tree.store(7);
        
        //第二颗树
        //BiTree treecopy = new BiTree(3);
        //treecopy.store(5);
        //treecopy.store(1);
        //treecopy.store(4);
        //treecopy.store(8);
        //treecopy.store(9);
        //int height = 0;
        //int height2 = 0;
        //boolean treeAVL1 = tree.IsAVL(tree,height);
        //boolean treeAVL2 = tree.IsAVL(treecopy, height2);
        //System.out.println("比较两个树结构"+ tree.TwoTreeStruct(tree, treecopy));
        //tree.sumNode();
        //System.out.println("输出二叉树结点的总个数:" + tree.sumNode());
        
        //System.out.println("二叉树的深度" + tree.deptTree(tree));
        
        //System.out.println("二叉树元素的查找"+ tree.find(8));
        
        //System.out.println("二叉树第k层节点的个数为" + tree.GetNodeNumKthLevel(tree, 3));
        
        //System.out.print("先序遍历");
        //tree.PreList();
        
        //System.out.print("树镜像后先序遍历");
        //tree.mirror(tree).PreList();
        
        //System.out.print("中序遍历");
        //tree.middList();
        
        //System.out.print("后序遍历");
        //tree.afterList();
        
        int PreList[] = {2,1,3,4};
        int middList[] = {1,2,3,4};
        BiTree bt = tree.RebuildTree(PreList, middList, 0,PreList.length-1, 0, PreList.length-1);
        System.out.print("层序遍历");
        bt.levelList(bt);
        System.out.println("\n");
        System.out.println(tree.NumLeaf(tree));
	}

	

}

class BiTree{
	private Object value;
	private BiTree leftchild;
	private BiTree rightchild;
	
	public  BiTree(Object value)
	{
		this.value = value;
	}
	
	/*public void store(Object values)
	{
		
		if( < this.value)
		{
			if(this.leftchild == null)
			{
				leftchild = new BiTree(values);
				//System.out.println(leftchild.value);
				//leftchild.value = values;
			}else{
				leftchild.store(values);
			}
		}else if(values > this.value){			   
			   if(this.rightchild == null)
			   {
				   rightchild = new BiTree(values);
				   //System.out.println(rightchild.value);
				   //rightchild.value = values;
			   }else{
				   
				   rightchild.store(values);
			   }
		}else{
			rightchild.store(values);
		}
	}
	public boolean find(int values)
	{
		if(this.value == values)
		{
			return true;
		}else if (values > this.value )
		{
			if(this.rightchild == null)
			{
				return false;
			}
			return this.rightchild.find(values);
		}else 
		{
			if(this.leftchild == null)
			{
				return false;
			}
			return this.leftchild.find(values);
		}
		
		
	}*/
	//求二叉树中的结点个数
	public int sumNode()
	{
		//如果二叉树为空，返回0，否则返回左子树+右子树结点的个数
		if(this == null) 
		{
			return 0;
		}else if (this.leftchild != null && this.rightchild == null)
		{
			return (this.leftchild.sumNode() + 1 ); 
		}else if(this.leftchild == null && this.rightchild != null)
		{
			return (this.rightchild.sumNode() + 1);
		}else if (this.leftchild != null && this.rightchild != null)
		{
			return (this.leftchild.sumNode() + this.rightchild.sumNode() + 1);
		}else{
			return 1;
		}		
		
	}
	public int deptTree(BiTree bt)
	{
		if(bt == null)
		{
			return 0;
		}
		int leftlength = deptTree(bt.leftchild);
		int rightlength = deptTree(bt.rightchild);
		return leftlength >= rightlength? (leftlength + 1):(rightlength + 1);
	}
	public List PreList()
	{
		List preList = new ArrayList();
		
		System.out.print(this.value);
		preList.add(this.value);

		if(this.leftchild != null)
		{
			List leftList = this.leftchild.PreList();
			preList.addAll(leftList);
		}
		if(this.rightchild != null)
		{
			List rightList = this.rightchild.PreList();
			preList.addAll(rightList);
		}
		return preList;
	}
	public List  middList()
	{
		List middlist = new ArrayList();
		if(this.leftchild != null)
		{
			List leftMiddleList = this.leftchild.middList();
			middlist.addAll(leftMiddleList);
		}
		System.out.print(this.value);
		middlist.add(this.value);
		if(this.rightchild != null)
		{
			List rightMiddleList = this.rightchild.middList();
			
			middlist.addAll(rightMiddleList);
		}
		return middlist;
		
	}
	public List afterList()
	{
		List afterList = new ArrayList();
		if(this.leftchild != null)
		{
			List leftList = this.leftchild.afterList();
			afterList.addAll(leftList);
		}
		
		if(this.rightchild != null)
		{
			List rightList = this.rightchild.afterList();
			afterList.addAll(rightList);
		}
		System.out.print(this.value);
		afterList.add(this.value);
		return afterList;
	}
	
	public void levelList(BiTree bt)
	{
		Queue<BiTree> queue = new LinkedList<BiTree>();
	    if(bt == null)
	    {
	    	System.out.print("The tree is an empty tree");
	    }
	    queue.add(bt);
	    while(!queue.isEmpty())
	    {
	    	BiTree bthead = (BiTree) queue.remove();
	    	System.out.print(bthead.value);
	    	if(bthead.leftchild != null)
	    	{
	    		queue.add(bthead.leftchild);
	    	}
	    	if(bthead.rightchild != null)
	    	{
	    		queue.add(bthead.rightchild);
	    	}
	    }
	    
	}
	public int GetNodeNumKthLevel(BiTree bt, int k)
	{
		if(bt == null || k < 1)
		{
			return 0;
		}
		if(k == 1)
		{
			return 1;
		}
		int left = GetNodeNumKthLevel(bt.leftchild,k-1);
		int right = GetNodeNumKthLevel(bt.rightchild,k-1);
		return  left + right ;
	}
	
	public int NumLeaf(BiTree bt)
	{
		
		if(bt == null)
		{
			return 0;
		}
		if(bt.leftchild == null && bt.rightchild == null)
		{
			return 1;
		}
		int leftnum = bt.NumLeaf(bt.leftchild);
		int rightnum = bt.NumLeaf(bt.rightchild);
		return leftnum + rightnum;
		/*int leftnum = 0,rightnum =0;
		if(bt.leftchild == null || bt.rightchild == null)
		{
			return 1;
		}else if(bt.leftchild != null && bt.rightchild == null)
		{
			 leftnum = NumLeaf(bt.leftchild);
		}else if(bt.leftchild == null && bt.rightchild != null)
		{
			 rightnum = NumLeaf(bt.rightchild);
		}else{
			 leftnum = NumLeaf(bt.leftchild);
			 rightnum = NumLeaf(bt.rightchild);
		
		}				
		return leftnum + rightnum;*/
		
	}
	
	public boolean TwoTreeStruct(BiTree btfirst, BiTree btsecond)
	{
		if(btfirst == null && btsecond == null)
		{
			return true;
		}else if(btfirst == null && btsecond != null){
			return false;
		}else if(btfirst != null && btsecond == null)
		{
			
			return false;
		}else {
			 boolean Treefirst  = TwoTreeStruct(btfirst.leftchild, btsecond.leftchild);
			 boolean Treesecond = TwoTreeStruct(btfirst.rightchild, btsecond.rightchild);
			 return (Treefirst && Treesecond);
		}
		
	}
	//判断二叉树是不是平衡二叉树
	public boolean IsAVL(BiTree bt, int height)
	{
		if(bt == null)
		{
			height = 0;
			return true;
		}
		int leftheight = 0;
		int rightheight = 0;
		boolean leftAVL = IsAVL(bt.leftchild, leftheight);
		boolean rightAVL = IsAVL(bt.rightchild, rightheight);
		
		if(leftAVL && rightAVL && Math.abs(leftheight - rightheight) <= 1)
		{
			height = Math.max(leftheight, rightheight) + 1;
			return true;
		}else{
			height = Math.max(leftheight, rightheight);
			return false;
		}	
	}
	
	//求二叉树的镜像
	public BiTree mirror(BiTree bt)
	{
		if(bt == null)
		{
			return null;
		}
		BiTree btleft = bt.mirror(bt.leftchild);
		BiTree btright = bt.mirror(bt.rightchild);
		BiTree tempbt = null;
	    
	    bt.leftchild = btright;
	    bt.rightchild = btleft;	
	    return bt;
	}
	public boolean findNode(BiTree bt, BiTree node)
	{
		if(bt == null || node == null)
		{
			return false;
		}
		if(bt == node)
		{
			return true;
		}
		boolean found = findNode(bt.leftchild,node);
		if(!found)
		{
			found = findNode(bt.rightchild,node);
		}
		return found;
	}
	BiTree GetLastCommonParent(BiTree bt, BiTree bt1, BiTree bt2)
	{
		if(findNode(bt.leftchild,bt1))
		{
		    if(findNode(bt.rightchild,bt1))
		    {
		    	return bt;
		    }else{
		    	return GetLastCommonParent(bt.leftchild, bt1, bt2);
		    }
		}else{
			if(findNode(bt.rightchild,bt2))
			{
				return bt;
			}else{
				return GetLastCommonParent(bt.rightchild, bt1, bt2);
			}
		}
	}
	public int GetMaxDistance(BiTree bt)
	{
		if(bt == null)
		{
			return 0;
		}
		int leftnum = GetMaxDistance(bt.leftchild);
		int rightnum = GetMaxDistance(bt.rightchild);
		return Math.max(leftnum, rightnum) + 1;
	}

	BiTree RebuildTree(int preTree[], int midTree[],int preleft,int preright, int midleft,int midright) {
		int position =  -1;
		if(preTree == null || midTree == null) {
			return null;
		}
		BiTree btRoot = new BiTree(Integer.valueOf(preTree[preleft]));
		for(int j = midleft; j <= midright; j++) {
			if(btRoot.value.equals(midTree[j])) {
					position = j;
					break;
			}
		}
		if(position == -1) {
			System.out.print("输入树序列有误");
			return null;
		}		
		
		//重建左子树
		if(position > midleft)
		{
			int leftcount = position - midleft;
			BiTree btRight = RebuildTree(preTree, midTree,preleft+1,preleft + leftcount, midleft, position-1);
		    btRoot.leftchild = btRight;
		}
		if(position < midright)
		{
			int rightcount = midright - position;
			//重建右子树
			BiTree btRight = RebuildTree(preTree, midTree, (preright - rightcount + 1 ), preright,(position + 1), midright);
		    btRoot.rightchild = btRight;
		    
		}
		
		
		return btRoot;		
		
	}
}

