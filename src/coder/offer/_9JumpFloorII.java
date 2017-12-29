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
 * 描述：一只青蛙跳n个台阶，每一次都可以跳1到n级。供n级台阶有几种跳法
 */
 //@formatter:on
public class _9JumpFloorII {
    public int JumpFloorII(int target) {
        if (target == 1) return 1;
        int first = 1;
        int second = 0;
        for (int i = 2; i <= target; i++) {
            second = 2 * first;
            first = second;
        }
        return second;
    }
}

//一次跳1级，则剩下的有f(n-1)；一次跳2级，则剩下的有f(n-2)...
//f(n) = f(n-1)+f(n-2)+...+f(1)+1
//f(n-1) = f(n-2)+f(n-3)+...+f(1)+1
//f(n) = 2*f(n-1)
