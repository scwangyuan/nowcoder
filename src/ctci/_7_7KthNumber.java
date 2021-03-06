package ctci;
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
 * 描述：有一些数的素因子只有3、5、7，请设计一个算法，找出其中的第k个数。
 * 给定一个数int k，请返回第k个数。保证k小于等于100。
 */
 //@formatter:on
 public class _7_7KthNumber {
     public int findKth(int k) {
         if (k <= 0) return 0;
         int[] a = new int[k];
         int i3 = 0;
         int i5 = 0;
         int i7 = 0;
         a[0] = 3;
         a[1] = 5;
         a[2] = 7;
         for (int i = 3; i < k; i++) {
             int min = Math.min(a[i3] * 3, Math.min(a[i5] * 5, a[i7] * 7));
             a[i] = min;
             if (min == a[i3] * 3) i3++;
             if (min == a[i5] * 5) i5++;
             if (min == a[i7] * 7) i7++;
         }
         return a[k - 1];
     }
 }

/*
思路：每个数都要乘三个数;
      也可以使用队列来做
 */
