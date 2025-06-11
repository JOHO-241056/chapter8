public class Hero {
    String name;
    int hp;
    Sword sword;

    //コンストラクタ
    // 引数なし
    public Hero() {//同じ名前
        this.hp = 100;
        this.name = "ダミー";
        //this(100, "ダミー");
        System.out.println("引数なし");
    }
    // 引数あり String
    public Hero(String name) {//同じ名前
        this.hp = 100;
        this.name = name;
        //this(100, name);
        System.out.println("引数あり String");
    }
    // 引数あり int
    public Hero(int hp) {//同じ名前
        this.hp = hp;
        this.name = "ダミー";
        //this(hp, "ダミー");
        System.out.println("引数あり int");
    }
    // 引数2つ
    public Hero(int hp, String name) {//同じ名前
        this.hp = hp;
        this.name = name;
        System.out.println("引数2つ");
    }

    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した！");
    }

    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した");
    }

    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("5のダメージ！");
    }

    public void run() {
        System.out.println(this.name + "は逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }

    public void attack() {
        System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
        System.out.println("敵に5ポイントのダメージをあたえた！");
    }
}
