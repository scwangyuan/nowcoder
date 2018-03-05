package coder.offer;
//@formatter:off
/**
 *                             _ooOoo_
 *                            o8888888o
 *                            88" . "88
 *                            (| -_- |)
 *                            O\  =  /O
 *                         ____/`---'\____
 *                       .'  \\|     |//  `.
 *                      /  \\|||  :  |||//  \
 *                     /  _||||| -:- |||||-  \
 *                     |   | \\\  -  /// |   |
 *                     | \_|  ''\---/''  |   |
 *                     \  .-\__  `-`  ___/-. /
 *                   ___`. .'  /--.--\  `. . __
 *                ."" '<  `.___\_<|>_/___.'  >'"".
 *               | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *               \  \ `-.   \_ __\ /__ _/   .-` /  /
 *          ======`-.____`-.___\_____/___.-`____.-'======
 *                             `=---='
 *          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 *                     佛祖保佑        永无BUG
 *
 * 描述：A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
 //@formatter:on
public class _51multiply {
    //一个矩阵把对角线去掉，每一行的乘积就是B对应位置的值,下三角连乘，上三角从后往前连乘，再每行相乘
    /*
 B0   0 1 1 1 1
 B1   1 0 1 1 1
 B2   1 1 0 1 1
 B3   1 1 1 0 1
 B4   1 1 1 1 0
     */
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        //计算下三角
        B[0] = 1;
        for (int i = 1; i < B.length; i++)
            B[i] = B[i - 1] * A[i - 1];//每一行比上一行多乘一个A[i-1]
        //再乘上三角(这里最后一行就不动了)
        int temp = 1;//这个用来辅助在前面的基础上乘
        for (int j = B.length - 2; j >= 0; j--) {
            temp *= A[j + 1];
            B[j] *= temp;
        }
        return B;
    }
}
