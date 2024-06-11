import IChingClasses.*;

public class AbstractIChingStoneFactory {

    public IChingStone iChingStone;

    public IChingStone createIChingStone(IChingStoneModel one, IChingStoneModel two){
        String stoneOneName = one.getStoneName();
        String stoneTwoName = two.getStoneName();

        iChingStone = defineStone(stoneOneName, stoneTwoName);
        return iChingStone;
    }

    private IChingStone defineStone(String stoneOneName, String stoneTwoName) {
        IChingStone stoneName = null;
        if(stoneOneName.equals("IChingClasses.Qian") && stoneTwoName.equals("IChingClasses.Qian")) {
            stoneName = new Qian();
        }
        if(stoneOneName.equals("IChingClasses.Qian") && stoneTwoName.equals("IChingClasses.Zhen")) {
            stoneName =  new WuWang();
        }
        if(stoneOneName.equals("IChingClasses.Qian") && stoneTwoName.equals("IChingClasses.Kan")) {
            stoneName = new Song();
        }
        if(stoneOneName.equals("IChingClasses.Qian") && stoneTwoName.equals("IChingClasses.Gen")) {
            stoneName = new Dun();
        }
        if(stoneOneName.equals("IChingClasses.Qian") && stoneTwoName.equals("IChingClasses.Kun")) {
            stoneName =  new Pi();
        }
        if(stoneOneName.equals("IChingClasses.Qian") && stoneTwoName.equals("IChingClasses.Xun")) {
            stoneName = new Gou();
        }
        if(stoneOneName.equals("IChingClasses.Qian") && stoneTwoName.equals("IChingClasses.Li")) {
            stoneName = new TongRen();
        }
        if(stoneOneName.equals("IChingClasses.Qian") && stoneTwoName.equals("IChingClasses.Dui")) {
            stoneName = new LuTreading();
        }
        if(stoneOneName.equals("IChingClasses.Zhen") && stoneTwoName.equals("IChingClasses.Qian")) {
            stoneName = new DaZhuang();
        }
        if(stoneOneName.equals("IChingClasses.Zhen") && stoneTwoName.equals("IChingClasses.Zhen")) {
            stoneName =  new Zhen();
        }
        if(stoneOneName.equals("IChingClasses.Zhen") && stoneTwoName.equals("IChingClasses.Kan")) {
            stoneName = new Jie();
        }
        if(stoneOneName.equals("IChingClasses.Zhen") && stoneTwoName.equals("IChingClasses.Gen")) {
            stoneName = new XiaoGuo();
        }
        if(stoneOneName.equals("IChingClasses.Zhen") && stoneTwoName.equals("IChingClasses.Kun")) {
            stoneName = new Yu();
        }
        if(stoneOneName.equals("IChingClasses.Zhen") && stoneTwoName.equals("IChingClasses.Xun")) {
            stoneName =  new Heng();
        }
        if(stoneOneName.equals("IChingClasses.Zhen") && stoneTwoName.equals("IChingClasses.Li")) {
            stoneName = new Feng();
        }
        if(stoneOneName.equals("IChingClasses.Zhen") && stoneTwoName.equals("IChingClasses.Dui")) {
            stoneName = new GuiMei();
        }
        if(stoneOneName.equals("IChingClasses.Kan") && stoneTwoName.equals("IChingClasses.Qian")) {
            stoneName = new Xu();
        }
        if(stoneOneName.equals("IChingClasses.Kan") && stoneTwoName.equals("IChingClasses.Zhen")) {
            stoneName = new Zhun();
        }
        if(stoneOneName.equals("IChingClasses.Kan") && stoneTwoName.equals("IChingClasses.Kan")) {
            stoneName = new Kan();
        }
        if(stoneOneName.equals("IChingClasses.Kan") && stoneTwoName.equals("IChingClasses.Gen")) {
            stoneName = new JianObstruction();
        }
        if(stoneOneName.equals("IChingClasses.Kan") && stoneTwoName.equals("IChingClasses.Kun")) {
            stoneName =  new BiUnion();
        }
        if(stoneOneName.equals("IChingClasses.Kan") && stoneTwoName.equals("IChingClasses.Xun")) {
            stoneName = new Jing();
        }
        if(stoneOneName.equals("IChingClasses.Kan") && stoneTwoName.equals("IChingClasses.Li")) {
            stoneName = new Jiji();
        }
        if(stoneOneName.equals("IChingClasses.Kan") && stoneTwoName.equals("IChingClasses.Dui")) {
            stoneName = new JieLimitation();
        }
        if(stoneOneName.equals("IChingClasses.Gen") && stoneTwoName.equals("IChingClasses.Qian")) {
            stoneName = new DaXu();
        }
        if(stoneOneName.equals("IChingClasses.Gen") && stoneTwoName.equals("IChingClasses.Zhen")) {
            stoneName = new YiNurishment();
        }
        if(stoneOneName.equals("IChingClasses.Gen") && stoneTwoName.equals("IChingClasses.Kan")) {
            stoneName = new Meng();
        }
        if(stoneOneName.equals("IChingClasses.Gen") && stoneTwoName.equals("IChingClasses.Gen")) {
            stoneName = new Gen();
        }
        if(stoneOneName.equals("IChingClasses.Gen") && stoneTwoName.equals("IChingClasses.Kun")) {
            stoneName = new Bo();
        }
        if(stoneOneName.equals("IChingClasses.Gen") && stoneTwoName.equals("IChingClasses.Xun")) {
            stoneName = new Gu();
        }
        if(stoneOneName.equals("IChingClasses.Gen") && stoneTwoName.equals("IChingClasses.Li")) {
            stoneName =  new BiAdornment();
        }
        if(stoneOneName.equals("IChingClasses.Gen") && stoneTwoName.equals("IChingClasses.Dui")) {
            stoneName = new Sun();
        }
        if(stoneOneName.equals("IChingClasses.Kun") && stoneTwoName.equals("IChingClasses.Qian")) {
            stoneName = new Tai();
        }
        if(stoneOneName.equals("IChingClasses.Kun") && stoneTwoName.equals("IChingClasses.Zhen")) {
            stoneName = new Fu();
        }
        if(stoneOneName.equals("IChingClasses.Kun") && stoneTwoName.equals("IChingClasses.Kan")) {
            stoneName = new Shi();
        }
        if(stoneOneName.equals("IChingClasses.Kun") && stoneTwoName.equals("IChingClasses.Gen")) {
            stoneName =  new QianModesty();
        }
        if(stoneOneName.equals("IChingClasses.Kun") && stoneTwoName.equals("IChingClasses.Kun")) {
            stoneName = new Kun();
        }
        if(stoneOneName.equals("IChingClasses.Kun") && stoneTwoName.equals("IChingClasses.Xun")) {
            stoneName = new ShengAscending();
        }
        if(stoneOneName.equals("IChingClasses.Kun") && stoneTwoName.equals("IChingClasses.Li")) {
            stoneName =  new MingYi();
        }
        if(stoneOneName.equals("IChingClasses.Kun") && stoneTwoName.equals("IChingClasses.Dui")) {
            stoneName = new Lin();
        }
        if(stoneOneName.equals("IChingClasses.Xun") && stoneTwoName.equals("IChingClasses.Qian")) {
            stoneName =  new XiaoXu();
        }
        if(stoneOneName.equals("IChingClasses.Xun") && stoneTwoName.equals("IChingClasses.Zhen")) {
            stoneName = new YiIncrease();
        }
        if(stoneOneName.equals("IChingClasses.Xun") && stoneTwoName.equals("IChingClasses.Kan")) {
            stoneName =  new Huan();
        }
        if(stoneOneName.equals("IChingClasses.Xun") && stoneTwoName.equals("IChingClasses.Gen")) {
            stoneName = new JianDevelopingGradually();
        }
        if(stoneOneName.equals("IChingClasses.Xun") && stoneTwoName.equals("IChingClasses.Kun")) {
            stoneName =  new Guan();
        }
        if(stoneOneName.equals("IChingClasses.Xun") && stoneTwoName.equals("IChingClasses.Xun")) {
            stoneName =  new Xun();
        }
        if(stoneOneName.equals("IChingClasses.Xun") && stoneTwoName.equals("IChingClasses.Li")) {
            stoneName = new JiaRen();
        }
        if(stoneOneName.equals("IChingClasses.Xun") && stoneTwoName.equals("IChingClasses.Dui")) {
            stoneName =  new ZhongFu();
        }
        if(stoneOneName.equals("IChingClasses.Li") && stoneTwoName.equals("IChingClasses.Qian")) {
            stoneName =   new DaYou();
        }
        if(stoneOneName.equals("IChingClasses.Li") && stoneTwoName.equals("IChingClasses.Zhen")) {
            stoneName = new ShihHe();
        }
        if(stoneOneName.equals("IChingClasses.Li") && stoneTwoName.equals("IChingClasses.Kan")) {
            stoneName =  new WeiJi();
        }
        if(stoneOneName.equals("IChingClasses.Li") && stoneTwoName.equals("IChingClasses.Gen")) {
            stoneName =  new LuTheWanderer();
        }
        if(stoneOneName.equals("IChingClasses.Li") && stoneTwoName.equals("IChingClasses.Kun")) {
            stoneName = new JinProgress();
        }
        if(stoneOneName.equals("IChingClasses.Li") && stoneTwoName.equals("IChingClasses.Xun")) {
            stoneName =  new DingTheCaldron();
        }
        if(stoneOneName.equals("IChingClasses.Li") && stoneTwoName.equals("IChingClasses.Li")) {
            stoneName =  new Li();
        }
        if(stoneOneName.equals("IChingClasses.Li") && stoneTwoName.equals("IChingClasses.Dui")) {
            stoneName =  new KuiOpposition();
        }
        if(stoneOneName.equals("IChingClasses.Dui") && stoneTwoName.equals("IChingClasses.Qian")) {
            stoneName =  new GuaiResolution();
        }
        if(stoneOneName.equals("IChingClasses.Dui") && stoneTwoName.equals("IChingClasses.Zhen")) {
            stoneName = new Sui();
        }
        if(stoneOneName.equals("IChingClasses.Dui") && stoneTwoName.equals("IChingClasses.Kan")) {
            stoneName =  new DuiOverflowing();
        }
        if(stoneOneName.equals("IChingClasses.Dui") && stoneTwoName.equals("IChingClasses.Gen")) {
            stoneName =  new XianMutualInfluence();
        }
        if(stoneOneName.equals("IChingClasses.Dui") && stoneTwoName.equals("IChingClasses.Kun")) {
            stoneName = new CuiGatheringTogether();
        }
        if(stoneOneName.equals("IChingClasses.Dui") && stoneTwoName.equals("IChingClasses.Xun")) {
            stoneName =  new DaGuoGreatAccumulation();
        }
        if(stoneOneName.equals("IChingClasses.Dui") && stoneTwoName.equals("IChingClasses.Li")) {
            stoneName = new GeRevolution();
        }
        if(stoneOneName.equals("IChingClasses.Dui") && stoneTwoName.equals("IChingClasses.Dui")) {
            stoneName = new Dui();
        }
        return stoneName;
    }
}
