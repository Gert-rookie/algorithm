package leetcode.Tree;



import niuke.sword.tree.TreeNode;

import java.util.Arrays;

/**
 * @Author: Gert
 * @Description: 最小高度树
 */

/**
 * 给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。
 *
 * 示例:
 * 给定有序数组: [-10,-3,0,5,9],
 *
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *
 *           0
 *          / \
 *        -3   9
 *        /   /
 *      -10  5
 *
 */
public class MinHightTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length<1){
            return null;
        }
        int mid=nums.length/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=sortedArrayToBST(Arrays.copyOfRange(nums,0,mid));
        node.right=sortedArrayToBST(Arrays.copyOfRange(nums,mid+1,nums.length));
        return node;
    }
}
