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
 * 描述：有一个单色屏幕储存在一维数组中，其中数组的每个元素代表连续的8位的像素的值，请实现一个函数，将第x到第y个像素涂上颜色(像素标号从零开始)，并尝试尽量使用最快的办法。
 * 给定表示屏幕的数组screen(数组中的每个元素代表连续的8个像素，且从左至右的像素分别对应元素的二进制的从低到高位)，以及int x,int y，意义如题意所述，保证输入数据合法。请返回涂色后的新的屏幕数组。
 * 测试样例：[0,0,0,0,0,0],0,47 返回：[255,255,255,255,255,255]
 */
 //@formatter:on
public class _5_8Render {
    public int[] renderPixel(int[] screen, int x, int y) {
        for (int i = x; i <= y; i++) {
            int k = i % 8; //计算位置
            int t = i / 8; //计算索引
            screen[t] = screen[t] | (1 << k); //该位置如果是0则变成1，如果是1则仍为1
        }
        return screen;
    }
}
