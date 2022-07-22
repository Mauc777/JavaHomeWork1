package JavaPracticeCore;

public class StringCore {
    public static void main(String[] args) {

        //#region
        // String[] name = { "M", "А", "И", "С" };
        // String mk = "МАИС КА.....";
        // System.out.println(mk.toLowerCase());
        // System.out.println(mk.toUpperCase());  //МАИС КА.....
        // System.out.println(String.join("__", name));  M__А__И__С
        //#endregion


        // #region
        // // Просчет милисекунд
        // var s = System.currentTimeMillis();
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < 1000000; i++) {
        // sb.append("+");
        // }
        // System.out.println(System.currentTimeMillis() - s);
        // // System.out.println(sb);
        // #endregion

        // #region
        // StringBuilder
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < 1000000; i++) {
        // sb.append("+");
        // System.out.println(sb);
        // }
        // #endregion

        // #region
        // // Выполняется около 1мин
        // String s = " ";
        // for (int i = 0; i < 1_000_000; i++) {
        // // s = "+";
        // // i++;
        // s+= "+";
        // }
        // #endregion
    }

}