import IChingClasses.*;
import IChingTests.KunTests;
import acm.graphics.GImage;
import acm.program.ConsoleProgram;

import java.util.HashMap;

public class IChingClassesTestSuite extends ConsoleProgram {

    public void run(){
        testingQuian();
        testingKun();
        testingGen();
        testingKan();
        testingLi();
        testingXun();
        testingZhen();
        testingDui();
        testingZhun();
        testingMeng();
        testingXu();
        testingSong();
        testingShi();
        testingBiUnion();
        testingXiaoXu();
        testingLuTreading();
        testingTai();
        testingPi();
        testingTongRen();
        testingDaYou();
        testingQianModesty();
        testingYu();
        testingSui();
        testingGu();
        testingLin();
        testingGuan();
        testingShihHe();
        testingBiAdornment();
        testingBo();
        testingFu();
        testingWuWang();
        testingDaXu();
        testingYiNourishment();
        testingDaGuo();
        testingXianMutualInfluence();
        testingHeng();
        testingDun();
        testingDaZhuang();
        testingJinProgress();
        testingMingYi();
        testingJiaRen();
        testingKuiOpposition();
        testingJianObstruction();
        testingJie();
        testingSun();
        testingYiIncrease();
        testingGuaiResolution();
        testingGou();
        testingCuiGathering();
        testingShengAscending();
        testingKunOppression();
        testingJing();
        testingGeRevolution();
        testingDingTheCaldron();
        testingJianDevelopingGradually();
        testingGuiMei();
        testingFeng();
        testingLuTheWanderer();
        testingJieLimitation();
        testingZhongFu();
        testingXiaoGuo();
        testingJiji();
        testingWeiJi();
    }

    public void testingQuian(){
        println("Testing Quian:");
        println("-------------------------------------------");
        QuianTests quianTests = new QuianTests();
        Qian quian = new Qian();
        GImage quianImage = quian.getIChingImage();
        String isSameImage = quianTests.isQuianImage(quianImage);
        String isSameImagePath = quianTests.isQuianSamePath(quianImage);
        println(isSameImagePath);
        println(isSameImage);
        String isClassImagePathTheSame = quianTests.isClassImagePathTheSame(quian);
        println(isClassImagePathTheSame);
        println("------------------------------------------");

        String elementName = quian.getElementName();
        String thisElementName = "Heaven, Heaven";
        String isSameElementName = quianTests.isSameElementName(elementName, thisElementName);
        println(isSameElementName);
        println("------------------------------------------");

        HashMap elementQualities = quian.getElementQualities();
        HashMap elementQualitiesShouldBe = new HashMap<String, String>();
        elementQualitiesShouldBe.put("1", "Creative");
        elementQualitiesShouldBe.put("2", "Dynamic");
        elementQualitiesShouldBe.put("3", "Strong");
        elementQualitiesShouldBe.put("4", "Assertion");
        elementQualitiesShouldBe.put("5", "Strength");
        elementQualitiesShouldBe.put("6", "Decisiveness");
        elementQualitiesShouldBe.put("7", "Strong Action");
        elementQualitiesShouldBe.put("8", "Going forward");
        elementQualitiesShouldBe.put("9", "Moving upward");
        elementQualitiesShouldBe.put("10", "Undertaking something");
        elementQualitiesShouldBe.put("11", "Constant and ceaseless exertion");
        String hasSameElementQualities = quianTests.hasSameElementQualities(elementQualitiesShouldBe, elementQualities);
        println(hasSameElementQualities);
        println("------------------------------------------");

        String quianfamilyMember = quian.getFamilyMember();
        String isFamilyMember = "Father";
        String isTheSameFamilyMember = quianTests.isTheSameFamilyMember(quianfamilyMember, isFamilyMember);
        println(isTheSameFamilyMember);
        println("------------------------------------------");

        HashMap quianBodyPart = quian.getBodyPart();
        HashMap thisBodyPart = new HashMap<String, String>();
        String hasTheSameBodyParts = quianTests.hasTheSameBodyPart(quianBodyPart, thisBodyPart);
        println(hasTheSameBodyParts);
        println("------------------------------------------");

        HashMap seasonAndWeather = quian.getSeasonAndWeather();
        HashMap thisSeasonAndWeather = new HashMap<String, String>();
        String areTheSameSeasonsAndWeather = quianTests.areTheSameSeasonsAndWeather(seasonAndWeather, thisSeasonAndWeather);
        println(areTheSameSeasonsAndWeather);
        String seasonsAndWeatherHasSameKeyAndValuesAsExpected = quianTests.seasonsAndWeatherHasSameKeyAndValuesAsExpected(seasonAndWeather);
        println(seasonsAndWeatherHasSameKeyAndValuesAsExpected);
        println("------------------------------------------");

        int number  = quian.getNumber();
        int thisNumber = 1;
        String isSameNumber = quianTests.isSameNumber(number, thisNumber);
        println(isSameNumber);
        println("------------------------------------------");

        HashMap divination = quian.getDivination();
        String isDivinationSameAsExpected = quianTests.isDivinationSameAsExpected(divination);
        println(isDivinationSameAsExpected);
        println("------------------------------------------");
    }

    public void testingKun() {
        println("Testing Kun:");
        println("-------------------------------------------");
        Kun kun = new Kun();
        KunTests kunTests = new KunTests();
        GImage thisImage = new GImage("../IChingImages/UpToSixtyFour/2.Kun.jpg");
        GImage kunImage = kun.getIChingImage();
        String isSameImage = kunTests.isKunImageSameImage(thisImage, kunImage);
        println(isSameImage);
        String isSameImagePath = kunTests.isKunImageSameImagePath(kun);
        println(isSameImagePath);
        String isSameClassImagePath = kunTests.isKunClassPathImageSamePath(kun);
        println(isSameClassImagePath);
        println("-------------------------------------------");

        String kunElementName = kun.getElementName();
        String expectedElementName = "Earth";
        String hasSameElement = kunTests.hasSameElement(kunElementName, expectedElementName);
        println(hasSameElement);
        println("-------------------------------------------");

        String kunHasSameQualities = kunTests.kunHasSameQualities(kun.getElementQualities());
        println(kunHasSameQualities);
        println("Element qualities are: " + kun.getElementQualities());
        println("-------------------------------------------");

        String kunFamilyMember = kun.getFamilyMember();
        String hasSameFamilyMember = kunTests.hasSameFamilyMember(kunFamilyMember);
        println(hasSameFamilyMember);
        println("Kun family members are" + kunFamilyMember);
        println("-------------------------------------------");

        HashMap kunSeasonsAndWeather = kun.getSeasonAndWeather();
        String hasSameSeasons = kunTests.hasSameSeasonsAndWeather(kunSeasonsAndWeather);
        println(hasSameSeasons);
        println("The seasons and weather are: " + kun.getSeasonAndWeather());
        println("-------------------------------------------");

        HashMap divination = kun.getDivination();
        String hasSameDivination = kunTests.kunHasSameDivination(divination);
        println(hasSameDivination);
        println("The divination keywords are : " + divination.get("Keywords"));
        println("-------------------------------------------");

        int number = kun.getNumber();
        int expectedNumber = 2;
        String isExpectedNumber = kunTests.hasSameExpectedNumber(number, expectedNumber);
        println(isExpectedNumber + " and is: " + expectedNumber);
        println("-------------------------------------------");
    }

    public void testingGen() {
        Gen gen = new Gen();
        GenTests genTests = new GenTests();
        println("Testing gen: ");
        println("-------------------------------------------");
        GImage thisImage = new GImage("../IChingImages/UpToSixtyFour/52.Gen.jpg");
        GImage genImage = gen.getIChingImage();
        String isSameImage = genTests.isTheSameGenImage(thisImage, genImage);
        println(isSameImage);
        String isSameImagePath = genTests.genHasSameImagePath(gen);
        println(isSameImagePath);
        println("-------------------------------------------");

        String genElement = gen.getElementName();
        String isTheSameGenElement = genTests.isTheSameGenElement(genElement);
        println(isTheSameGenElement);
        println("-------------------------------------------");

        HashMap genQualities = gen.getElementQualities();
        String areTheSameGenQualities = genTests.areTheSameQualities(genQualities);
        println(areTheSameGenQualities);
        println("-------------------------------------------");

        String genAnimals = gen.getRelatedAnimal();
        String areTheSameAnimals = genTests.hasTheSameAnimals(genAnimals);
        println(areTheSameAnimals);
        println("-------------------------------------------");

        HashMap divination = gen.getDivination();
        String isTheSameDivination =  genTests.isTheSameDivination(divination);
        println(isTheSameDivination);
        println("-------------------------------------------");

        int number = gen.getNumber();
        String isTheSameNumber = genTests.isTheSameNumber(number);
        println(isTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingKan() {
        println("Testing Kan:");
        println("-------------------------------------------");

        Kan kan = new Kan();
        KanTests kanTests = new KanTests();
        GImage thisImage = new GImage("../IChingImages/UpToSixtyFour/29.Kan.jpg");
        GImage kanImage = kan.getIChingImage();
        String isSameImage = kanTests.isKanImageSameImage(thisImage, kanImage);
        println(isSameImage);
        String isSameImageClassPath = kanTests.isKanImageSameImageClassPath(kan);
        println(isSameImageClassPath);
        println("-------------------------------------------");

        String isKanElementTheSame = kanTests.isKanElementTheSame(kan);
        println(isKanElementTheSame);
        println("-------------------------------------------");

        String kanHasSameElementQualities = kanTests.kanHasSameElementQualities(kan);
        println(kanHasSameElementQualities);
        println("-------------------------------------------");

        String kanHasTheSameFamilyMember = kanTests.kanHasTheSameFamilyMember(kan);
        println(kanHasTheSameFamilyMember);
        println("-------------------------------------------");

        String kanHasTheSameBodyPart = kanTests.kanHasSamePartOfBody(kan);
        println(kanHasTheSameBodyPart);
        println("-------------------------------------------");

        String kanHasTheSameSeasonsAndWeather = kanTests.kanHasTheSameSeasonsAndWeather(kan);
        println(kanHasTheSameSeasonsAndWeather);
        println("-------------------------------------------");

        String hasTheSameDivination = kanTests.kanHasTheSameDivination(kan);
        println(hasTheSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = kanTests.kanHasTheSameNumber(kan);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingLi() {
        println("Testing Li:");
        println("-------------------------------------------");
        Li li = new Li();
        LiTests liTests = new LiTests();

        String isTheSameLiImage = liTests.isTheSameLiImage(li);
        println(isTheSameLiImage);
        String imageHasTheSameClassPath = liTests.imageHasTheSameClassPath(li);
        println(imageHasTheSameClassPath);
        println("-------------------------------------------");

        String liHasTheSameElementName = liTests.liHasTheSameElementName(li);
        println(liHasTheSameElementName);
        println("-------------------------------------------");

        String  liHasTheSameQualities = liTests.liHasTheSameQualities(li);
        println(liHasTheSameQualities);
        println("-------------------------------------------");

        String liHasTheSameFamilyMember = liTests.liHasTheSameFamilyMember(li);
        println(liHasTheSameFamilyMember);
        println("-------------------------------------------");

        String liHasTheSameBodyPart = liTests.liHasTheSameBodyPart(li);
        println(liHasTheSameBodyPart);
        println("-------------------------------------------");

        String liAnimals = liTests.liHasTheSameAnimals(li);
        println(liAnimals);
        println("-------------------------------------------");

        String liHasSameSeasonsAndWeather = liTests.liHasSameSeasonsAndWeather(li);
        println(liHasSameSeasonsAndWeather);
        println("-------------------------------------------");

        String liHasTheSameDivination = liTests.liHasTheSameDivination(li);
        println(liHasTheSameDivination);
        println("-------------------------------------------");

        String liHasTheSameNumber = liTests.liHasTheSameNumber(li);
        println(liHasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingXun() {
        println("Testing Xun:");
        println("-------------------------------------------");
        Xun xun = new Xun();
        XunTests xunTests = new XunTests();
        String xunImageIsSameAsExpected = xunTests.xunImageIsSameAsExpected(xun);
        println(xunImageIsSameAsExpected);
        String xunImageHasSameClassPath = xunTests.xunImageHasSameClassPath(xun);
        println(xunImageHasSameClassPath);
        println("-------------------------------------------");

        String hasSameElementName = xunTests.hasSameElementName(xun);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameElementPropreties = xunTests.hasSameElementPropreties(xun);
        println(hasSameElementPropreties);
        println("-------------------------------------------");

        String hasTheSameFamilyMember = xunTests.hasTheSameFamilyMember(xun);
        println(hasTheSameFamilyMember);
        println("-------------------------------------------");

        String hasTheSamePartOfBody = xunTests.hasTheSamePartOfBody(xun);
        println(hasTheSamePartOfBody);
        println("-------------------------------------------");

        String hasTheSameAnimals = xunTests.hasTheSameAnimals(xun);
        println(hasTheSameAnimals);
        println("-------------------------------------------");

        String hasSameWeatherAndSeasons = xunTests.hasSameWeatherAndSeasons(xun);
        println(hasSameWeatherAndSeasons);
        println("-------------------------------------------");

        String xunHasSameDivination = xunTests.hasSameDivination(xun);
        println(xunHasSameDivination);
        println("-------------------------------------------");

        String xunHasSameNumber = xunTests.hasSameNumber(xun);
        println(xunHasSameNumber);
        println("-------------------------------------------");
     }

    public void testingZhen() {
        println("Testing Zhen:");
        println("-------------------------------------------");
        Zhen zhen = new Zhen();
        ZhenTests zhenTests = new ZhenTests();
        String isZhenImageTheSame = zhenTests.isZhenImageTheSame(zhen);
        println(isZhenImageTheSame);
        String isZhenClassPathTheSame = zhenTests.isZhenImagePathTheSame(zhen);
        println(isZhenClassPathTheSame);
        println("-------------------------------------------");

        String isTheSameZhenElementName = zhenTests.isTheSameZhenElement(zhen);
        println(isTheSameZhenElementName);
        println("-------------------------------------------");

        String hasSameElementQualities = zhenTests.hasSameElementQualities(zhen);
        println(hasSameElementQualities);
        println("-------------------------------------------");

        String hasSameFamilyMember = zhenTests.hasSameFamilyMember(zhen);
        println(hasSameFamilyMember);
        println("-------------------------------------------");

        String hasSamePartOfBody = zhenTests.hasSamePartOfBody(zhen);
        println(hasSamePartOfBody);
        println("-------------------------------------------");

        String hasSameRelatedAnimals = zhenTests.hasSameRelatedAnimals(zhen);
        println(hasSameRelatedAnimals);
        println("-------------------------------------------");

        String hasTheSameSeasonsAndWeather = zhenTests.hasTheSameSeasonsAndWeather(zhen);
        println(hasTheSameSeasonsAndWeather);
        println("-------------------------------------------");

        String hasSameDivination = zhenTests.hasSameDivination(zhen);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasTheSameNumber = zhenTests.hasTheSameNumber(zhen);
        println(hasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingDui(){
        println("Testing Dui:");
        println("-------------------------------------------");
        Dui dui = new Dui();
        DuiTests duiTests = new DuiTests();

        String duiHasTheSameImage = duiTests.hasTheSameImage(dui);
        println(duiHasTheSameImage);
        String duiHasTheSameImagePath = duiTests.hasSameImageClassPath(dui);
        println(duiHasTheSameImagePath);
        println("-------------------------------------------");

        String duiHasSameElementName = duiTests.hasSameElementName(dui);
        println(duiHasSameElementName);
        println("-------------------------------------------");

        String duiHasTheSameQualities = duiTests.hasSameElementQualities(dui);
        println(duiHasTheSameQualities);
        println("-------------------------------------------");

        String duiHasSameFamilyMember = duiTests.hasSameFamilyMember(dui);
        println(duiHasSameFamilyMember);
        println("-------------------------------------------");

        String duiHasSamePartOfBody = duiTests.hasSamePartOfBody(dui);
        println(duiHasSamePartOfBody);
        println("-------------------------------------------");

        String duiHasSameDivinationText = duiTests.hasSameDivinationText(dui);
        println(duiHasSameDivinationText);
        println("-------------------------------------------");

        String duiHasTheSameNumber = duiTests.hasTheSameNumber(dui);
        println(duiHasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingZhun() {
        println("Testing Zhun:");
        println("-------------------------------------------");
        Zhun zhun = new Zhun();
        ZhunTests zhunTests = new ZhunTests();

        String hasSameImage = zhunTests.isSameImage(zhun);
        println(hasSameImage);
        String hasSameImagePath = zhunTests.imageHasSameClassPath(zhun);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String zhunHasSameElementName = zhunTests.hasSameElementName(zhun);
        println(zhunHasSameElementName);
        println("-------------------------------------------");

        String zhunHasSameElementQualities = zhunTests.hasSameElementQualities(zhun);
        println(zhunHasSameElementQualities);
        println("-------------------------------------------");

        String zhunHasSameDivination = zhunTests.hasSameDivination(zhun);
        println(zhunHasSameDivination);
        println("-------------------------------------------");

        String zhunHasTheSameNumber = zhunTests.hasSameNumber(zhun);
        println(zhunHasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingMeng() {
        println("Testing Meng:");
        println("-------------------------------------------");
        Meng meng = new Meng();
        MengTests mengTests = new MengTests();
        String mengHasTheSameImage = mengTests.hasSameImage(meng);
        println(mengHasTheSameImage);
        String mengHasTheSameImageClassPath = mengTests.hasTheSameImageClassPath(meng);
        println(mengHasTheSameImageClassPath);
        println("-------------------------------------------");

        String mengHasTheSameElementName = mengTests.hasTheSameElementName(meng);
        println(mengHasTheSameElementName);
        println("-------------------------------------------");

        String mengHasTheSameQualities = mengTests.hasTheSameElementQualities(meng);
        println(mengHasTheSameQualities);
        println("-------------------------------------------");

        String mengHasSameDivination = mengTests.hasSameDivination(meng);
        println(mengHasSameDivination);
        println("-------------------------------------------");

        String mengHasTheSameNumber = mengTests.hasSameNumber(meng);
        println(mengHasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingXu() {
        println("Testing Xu:");
        println("-------------------------------------------");

        Xu xu = new Xu();
        XuTests xuTests = new XuTests();
        String xuHasSameExpectedImage = xuTests.hasSameImage(xu);
        println(xuHasSameExpectedImage);
        String xuHasTheSameExpectedImagePath = xuTests.hasTheSameImageClassPath(xu);
        println(xuHasTheSameExpectedImagePath);
        println("-------------------------------------------");

        String xuHasSameElementName = xuTests.hasTheSameElementName(xu);
        println(xuHasSameElementName);
        println("-------------------------------------------");

        String xuHasSameQualities = xuTests.hasSameElementQualities(xu);
        println(xuHasSameQualities);
        println("-------------------------------------------");

        String xuHasTheSameDivination = xuTests.hasSameDivination(xu);
        println(xuHasTheSameDivination);
        println("-------------------------------------------");

        String xuHasTheSameNumber = xuTests.hasSameNumber(xu);
        println(xuHasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingSong() {
        println("Testing Song:");
        println("-------------------------------------------");

        Song song = new Song();
        SongTests  songTests = new SongTests();

        String songHasTheSameImage = songTests.songImageIsSameAsExpected(song);
        println(songHasTheSameImage);
        String songHasSameClassPath = songTests.songImageClassPathIsAsExpected(song);
        println(songHasSameClassPath);
        println("-------------------------------------------");

        String songHasTheSameElementName = songTests.songElementIsAsExpected(song);
        println(songHasTheSameElementName);
        println("-------------------------------------------");

        String songHasTheSameQualities = songTests.songElementHasSameQualitiesAsExpected(song);
        println(songHasTheSameQualities);
        println("-------------------------------------------");

        String songHasTheSameDivination = songTests.songHasTheSameDivination(song);
        println(songHasTheSameDivination);
        println("-------------------------------------------");

        String songHasTheSameNumber = songTests.songHasTheSameNumber(song);
        println(songHasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingShi() {
        println("Testing Shi:");
        println("-------------------------------------------");
        Shi shi = new Shi();
        ShiTests  shiTests = new ShiTests();

        String shiHasTheSameImage = shiTests.shiHasTheSameImage(shi);
        println(shiHasTheSameImage);
        String shiHasTheSameImagePath = shiTests.shiHasTheSameImagePath(shi);
        println(shiHasTheSameImagePath);
        println("-------------------------------------------");

        String shiHasSameElementName = shiTests.shiHasTheSameElements(shi);
        println(shiHasSameElementName);
        println("-------------------------------------------");

        String shiHasTheSameQualities = shiTests.shiHasTheSameQualities(shi);
        println(shiHasTheSameQualities);
        println("-------------------------------------------");

        String shiHasTheSameDivination = shiTests.shiHasTheSameDivination(shi);
        println(shiHasTheSameDivination);
        println("-------------------------------------------");

        String shiHasTheSameNumber = shiTests.shiHasTheSameNumber(shi);
        println(shiHasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingBiUnion() {
        println("Testing BiUnion:");
        println("-------------------------------------------");

        BiUnion biUnion = new BiUnion();
        BiUnionTests biUnionTests = new BiUnionTests();
        String biUnionHasSameImage = biUnionTests.isBiUnionImageTheSame(biUnion);
        println(biUnionHasSameImage);
        String biUnionHasSameImagePath = biUnionTests.isBiUnionClassPathTheSame(biUnion);
        println(biUnionHasSameImagePath);
        println("-------------------------------------------");

        String biUnionHasSameElementName = biUnionTests.hasBiUnionSameElements(biUnion);
        println(biUnionHasSameElementName);
        println("-------------------------------------------");

        String biUnionHasTheSameElementQualities = biUnionTests.biUnionHasTheSameQualities(biUnion);
        println(biUnionHasTheSameElementQualities);
        println("-------------------------------------------");

        String biUnionHasSameDivination = biUnionTests.biUnionHasTheSameDivination(biUnion);
        println(biUnionHasSameDivination);
        println("-------------------------------------------");

        String biUnionHasTheSameNumber = biUnionTests.biUnionHasTheSameNumber(biUnion);
        println(biUnionHasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingXiaoXu() {
        println("Testing XiaoXu:");
        println("-------------------------------------------");

        XiaoXu xiaoXu = new XiaoXu();
        XiaoXuTests xiaoXuTests = new XiaoXuTests();

        String xiaoXuHasSameImage = xiaoXuTests.xiaoXuHasSameImage(xiaoXu);
        println(xiaoXuHasSameImage);
        String xiaoXuHasTheSameImageClassPath = xiaoXuTests.xiaoXuHasTheSameImagePath(xiaoXu);
        println(xiaoXuHasTheSameImageClassPath);
        println("-------------------------------------------");

        String xiaoXuHasSameElementName = xiaoXuTests.xiaoXuHasSameElementName(xiaoXu);
        println(xiaoXuHasSameElementName);
        println("-------------------------------------------");

        String xiaoXuHasTheSameQualities = xiaoXuTests.xiaoXuHasSameQualities(xiaoXu);
        println(xiaoXuHasTheSameQualities);
        println("-------------------------------------------");

        String xiaoXuHasTheSameDivination = xiaoXuTests.xiaoXuHasTheSameDivination(xiaoXu);
        println(xiaoXuHasTheSameDivination);
        println("-------------------------------------------");

        String xiaoXuHasSameNumber = xiaoXuTests.xiaoXuHasTheSameNumber(xiaoXu);
        println(xiaoXuHasSameNumber);
        println("-------------------------------------------");
    }

    public void testingLuTreading() {
        println("Testing LuTreading:");
        println("-------------------------------------------");

        LuTreading luTreading = new LuTreading();
        LuTreadingTests luTreadingTests = new LuTreadingTests();

        String luTreadingHasSameImage = luTreadingTests.luTreadingHasSameImage(luTreading);
        println(luTreadingHasSameImage);
        String luTreadingHasTheSameImagePath = luTreadingTests.luTreadingHasSameImageClassPath(luTreading);
        println(luTreadingHasTheSameImagePath);
        println("-------------------------------------------");

        String luTreadingHasSameElementName = luTreadingTests.luTreadingHasSameElementName(luTreading);
        println(luTreadingHasSameElementName);
        println("-------------------------------------------");

        String luTreadingHasSameQualities = luTreadingTests.luTreadingHasSameQualities(luTreading);
        println(luTreadingHasSameQualities);
        println("-------------------------------------------");

        String luTreadingHasSameDivination = luTreadingTests.luTreadingHasTheSameDivination(luTreading);
        println(luTreadingHasSameDivination);
        println("-------------------------------------------");

        String luTreadingHasTheSameNumer = luTreadingTests.luTreadingHasSameNumber(luTreading);
        println(luTreadingHasTheSameNumer);
        println("-------------------------------------------");
    }

    public void testingTai(){
        println("Testing Tai:");
        println("-------------------------------------------");
        Tai tai = new Tai();
        TaiTests taiTests = new TaiTests();

        String taiHasTheSameImage = taiTests.taiHasTheSameImage(tai);
        println(taiHasTheSameImage);
        println("-------------------------------------------");

        String taiHasTheSameImagePath = taiTests.taiHasTheSameImagePath(tai);
        println(taiHasTheSameImagePath);
        println("-------------------------------------------");

        String taiHasTheSameElementName = taiTests.taiHasSameElementName(tai);
        println(taiHasTheSameElementName);
        println("-------------------------------------------");

        String taiHasTheSameQualities = taiTests.taiHasTheSameQualities(tai);
        println(taiHasTheSameQualities);
        println("-------------------------------------------");

        String taiHasSameDivination = taiTests.taiHasTheSameDivination(tai);
        println(taiHasSameDivination);
        println("-------------------------------------------");

        String taiHasSameNumber = taiTests.taiHasTheSameNumber(tai);
        println(taiHasSameNumber);
        println("-------------------------------------------");


    }

    public void testingPi() {
        println("Testing Pi:");
        println("-------------------------------------------");
        Pi pi = new Pi();
        PiTests piTests = new PiTests();

        String piHasTheExpectedImage = piTests.piHasTheSameImage(pi);
        println(piHasTheExpectedImage);
        String piHasTheExpectedImagePath = piTests.piHasTheSameImagePath(pi);
        println(piHasTheExpectedImagePath);
        println("-------------------------------------------");

        String piHasTheSameElementName = piTests.piHasTheSameElementName(pi);
        println(piHasTheSameElementName);
        println("-------------------------------------------");

        String piHasTheSameElementQualities = piTests.piHasTheSameQualities(pi);
        println(piHasTheSameElementQualities);
        println("-------------------------------------------");

        String piHasTheSameDivination = piTests.piHasTheSameDivination(pi);
        println(piHasTheSameDivination);
        println("-------------------------------------------");

        String piHasTheSameNumber = piTests.piHasTheSameNumber(pi);
        println(piHasTheSameNumber);
        println("-------------------------------------------");

    }

    public void testingTongRen() {
        println("Testing Tong Ren:");
        println("-------------------------------------------");

        TongRen tongRen = new TongRen();
        TongRenTests tongRenTests = new TongRenTests();
        String hasTheSameImage = tongRenTests.tongRenHasSameImage(tongRen);
        println(hasTheSameImage);
        String hasTheSameImagePath = tongRenTests.tongRenHasSameImagePath(tongRen);
        println(hasTheSameImagePath);
        println("-------------------------------------------");

        String hasTheSameElementName = tongRenTests.tongRenHasTheSameElementName(tongRen);
        println(hasTheSameElementName);
        println("-------------------------------------------");

        String hasTheSameElementQualities = tongRenTests.tongRenHasTheSameQualities(tongRen);
        println(hasTheSameElementQualities);
        println("-------------------------------------------");

        String hasTheSameDivination = tongRenTests.tongRenHasTheSameDivination(tongRen);
        println(hasTheSameDivination);
        println("-------------------------------------------");

        String hasTheSameNumber = tongRenTests.tongRenHasTheSameNumber(tongRen);
        println(hasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingDaYou() {
        println("Testing Da You:");
        println("-------------------------------------------");

        DaYou daYou = new DaYou();
        DaYouTests daYouTests = new DaYouTests();
        String hasSameImagePath = daYouTests.daYouHasSameImagePath(daYou);
        println(hasSameImagePath);
        String hasSameImage = daYouTests.daYouHasTheSameImage(daYou);
        println(hasSameImage);
        println("-------------------------------------------");

        String hasSameElementName = daYouTests.daYouHasSameElementName(daYou);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = daYouTests.daYouHasSameQualities(daYou);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = daYouTests.daYouHasTheSameDivination(daYou);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = daYouTests.daYouHasSameNumber(daYou);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingQianModesty() {
        println("Testing Qian Modesty:");
        println("-------------------------------------------");

        QianModesty qianModesty = new QianModesty();
        QianModestyTests qianModestyTests = new QianModestyTests();

        String hasTheSameImage = qianModestyTests.hasTheSameImage(qianModesty);
        println(hasTheSameImage);
        String hasSameImagePath = qianModestyTests.hasTheSameImagePath(qianModesty);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String  hasSameElementName = qianModestyTests.hasTheSameElementName(qianModesty);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = qianModestyTests.hasTheSameQualities(qianModesty);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = qianModestyTests.hasSameDivination(qianModesty);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = qianModestyTests.hasSameNumber(qianModesty);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingYu() {
        println("Testing Yu:");
        println("-------------------------------------------");
         Yu yu = new Yu();
         YuTests yuTests = new YuTests();

         String hasSameImage = yuTests.hasSameImage(yu);
         println(hasSameImage);
         String hasSameImagePath = yuTests.hasSameImagePath(yu);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = yuTests.hasSameElementName(yu);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = yuTests.hasSameQualities(yu);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = yuTests.hasTheSameDivination(yu);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = yuTests.hasTheSameNumber(yu);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingSui() {
        println("Testing Sui:");
        println("-------------------------------------------");

        Sui sui = new Sui();
        SuiTests suiTests = new SuiTests();
        String hasSameImage = suiTests.suiHasSameImage(sui);
        println(hasSameImage);
        String hasSameImagePath = suiTests.hasSameImagePath(sui);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = suiTests.hasSameElements(sui);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameElementQualities = suiTests.hasSameQualities(sui);
        println(hasSameElementQualities);
        println("-------------------------------------------");

        String hasSameDivination = suiTests.hasTheSameDivination(sui);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasTheSameNumber = suiTests.hasTheSameNumber(sui);
        println(hasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingGu() {
        println("Testing Gu:");
        println("-------------------------------------------");

        Gu gu = new Gu();
        GuTests guTests = new GuTests();
        String hasSameImage = guTests.hasSameImage(gu);
        println(hasSameImage);
        String hasSameImagePath = guTests.hasTheSameImagePath(gu);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = guTests.hasTheSameElementName(gu);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = guTests.hasTheSameQualities(gu);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = guTests.hasTheSameDivination(gu);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = guTests.hasTheSameNumber(gu);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingLin() {
        println("Testing Lin");
        println("-------------------------------------------");
        Lin lin = new Lin();
        LinTests linTests = new LinTests();
        String hasTheSameImage = linTests.linHasTheSameImage(lin);
        println(hasTheSameImage);
        String hasTheSameImagePath = linTests.linHasTheSameImagePath(lin);
        println(hasTheSameImagePath);
        println("-------------------------------------------");

        String linHasSameElementName = linTests.hasTheSameElementName(lin);
        println(linHasSameElementName);
        println("-------------------------------------------");

        String linHasTheSameQualities = linTests.hasTheSameQualities(lin);
        println(linHasTheSameQualities);
        println("-------------------------------------------");

        String linHasTheSameDivination = linTests.hasTheSameDivination(lin);
        println(linHasTheSameDivination);
        println("-------------------------------------------");

        String hasTheSameNumber = linTests.hasTheSameNumber(lin);
        println(hasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingGuan() {
        println("Testing Guan");
        println("-------------------------------------------");

        Guan guan = new Guan();
        GuanTests guanTests = new GuanTests();
        String hasSameImage = guanTests.hasSameImage(guan);
        println(hasSameImage);
        String hasSameImagePath = guanTests.hasSameImagePath(guan);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = guanTests.hasSameElement(guan);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = guanTests.hasSameQualities(guan);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = guanTests.hasSameDivination(guan);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = guanTests.hasSameNumber(guan);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingShihHe() {
        println("Testing ShihHe");
        println("-------------------------------------------");
        ShihHe shihHe = new ShihHe();
        ShihHeTests shihHeTests = new ShihHeTests();

        String hasSameImage = shihHeTests.hasTheSameImage(shihHe);
        println(hasSameImage);
        String hasSameImagePath = shihHeTests.hasTheSameImageClassPath(shihHe);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasTheSameElementName = shihHeTests.hasSameElementName(shihHe);
        println(hasTheSameElementName);
        println("-------------------------------------------");

        String hasTheSameQualities = shihHeTests.hasTheSameQualities(shihHe);
        println(hasTheSameQualities);
        println("-------------------------------------------");

        String hasTheSameDivination = shihHeTests.hasTheSameDivination(shihHe);
        println(hasTheSameDivination);
        println("-------------------------------------------");

        String hasTheSameNumber = shihHeTests.hasTheSameNumber(shihHe);
        println(hasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingBiAdornment() {
        println("Testing Bi Adornment");
        println("-------------------------------------------");
        BiAdornment biAdornment = new BiAdornment();
        BiAdornmentTests biAdornmentTests = new BiAdornmentTests();
        String hasSameImage = biAdornmentTests.hasSameImage(biAdornment);
        println(hasSameImage);
        String hasSameImagePath = biAdornmentTests.hasSameImagePath(biAdornment);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = biAdornmentTests.hasTheSameElementName(biAdornment);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities =  biAdornmentTests.hasExpectedQualities(biAdornment);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = biAdornmentTests.hasExpectedDivination(biAdornment);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = biAdornmentTests.hasExpectedNumber(biAdornment);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingBo() {
        println("Testing Bo");
        println("-------------------------------------------");

        Bo bo = new Bo();
        BoTests boTests = new BoTests();
        String hasSameImage = boTests.hasSameImage(bo);
        println(hasSameImage);
        String hasSameImagePath = boTests.hasTheSameImagePath(bo);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = boTests.hasTheSameElementName(bo);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameExpectedQualities = boTests.hasTheSameQualities(bo);
        println(hasSameExpectedQualities);
        println("-------------------------------------------");

        String hasTheSameDivination = boTests.hasTheSameDivination(bo);
        println(hasTheSameDivination);
        println("-------------------------------------------");

        String hasTheSameNumber = boTests.hasTheSameNumber(bo);
        println(hasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingFu() {
        println("Testing Fu");
        println("-------------------------------------------");
        Fu fu = new Fu();
        FuTests fuTests = new FuTests();

        String hasSameImage = fuTests.hasSameImage(fu);
        println(hasSameImage);
        String hasSameImagePath = fuTests.hasSameImagePath(fu);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = fuTests.hasSameElementName(fu);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasTheSameQualities = fuTests.hasTheSameQualities(fu);
        println(hasTheSameQualities);
        println("-------------------------------------------");

        String hasTheSameDivination = fuTests.hasTheSameDivination(fu);
        println(hasTheSameDivination);
        println("-------------------------------------------");

        String hasTheSameNumber = fuTests.hasTheSameNumber(fu);
        println(hasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingWuWang() {
        println("Testing WuWang");
        println("-------------------------------------------");

        WuWang wuWang = new WuWang();
        WuWangTests wuWangTests = new WuWangTests();

        String hasTheSameImage = wuWangTests.hasSameImage(wuWang);
        println(hasTheSameImage);
        String hasTheSameImagePath = wuWangTests.hasTheSameImagePath(wuWang);
        println(hasTheSameImagePath);
        println("-------------------------------------------");

        String hasTheSameElementName = wuWangTests.hasSameElementName(wuWang);
        println(hasTheSameElementName);
        println("-------------------------------------------");

        String hasTheSameElementQualities = wuWangTests.hasSameElementQualities(wuWang);
        println(hasTheSameElementQualities);
        println("-------------------------------------------");

        String hasTheSameDivination = wuWangTests.hasSameDivination(wuWang);
        println(hasTheSameDivination);
        println("-------------------------------------------");

        String hasTheSameNumber = wuWangTests.hasTheSameNumber(wuWang);
        println(hasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingDaXu() {
        println("Testing Da Xu");
        println("-------------------------------------------");

        DaXu daXu = new DaXu();
        DaXuTests daXuTests = new DaXuTests();

        String hasSameImage = daXuTests.hasSameImage(daXu);
        println(hasSameImage);
        String hasSameImagePath = daXuTests.hasSameImagePath(daXu);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = daXuTests.hasTheSameElementName(daXu);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = daXuTests.hasTheSameQualties(daXu);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = daXuTests.hasSameDivination(daXu);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = daXuTests.hasTheSameNumber(daXu);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingYiNourishment() {
        println("Testing Yi Nourishment:");
        println("-------------------------------------------");
        YiNurishment yiNurishment = new YiNurishment();
        YiNourishmentTests yiNourishmentTests = new YiNourishmentTests();

        String hasSameImage = yiNourishmentTests.hasSameImage(yiNurishment);
        println(hasSameImage);
        String hasSameImagePath = yiNourishmentTests.hasSameImagePath(yiNurishment);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = yiNourishmentTests.hasExpectedElementName(yiNurishment);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameExpectedQualities = yiNourishmentTests.hasSameQualities(yiNurishment);
        println(hasSameExpectedQualities);
        println("-------------------------------------------");

        String hasSameExpectedDivination = yiNourishmentTests.hasSameDivination(yiNurishment);
        println(hasSameExpectedDivination);
        println("-------------------------------------------");

        String hasExpectedNumber = yiNourishmentTests.hasSameNumber(yiNurishment);
        println(hasExpectedNumber);
        println("-------------------------------------------");
    }

    public void testingDaGuo() {
        println("Testing Da Guo:");
        println("-------------------------------------------");
        DaGuo daGuo = new DaGuo();
        DaGuoTests daGouTests = new DaGuoTests();

        String hasSameImage = daGouTests.hasSameImage(daGuo);
        println(hasSameImage);
        String hasSameImagePath = daGouTests.hasTheSameImagePath(daGuo);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = daGouTests.hasTheSameElementName(daGuo);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = daGouTests.hasTheExpectedQualities(daGuo);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = daGouTests.hasSameDivination(daGuo);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = daGouTests.hasTheSameNumber(daGuo);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingXianMutualInfluence() {
        println("Testing Xian Mutual Influence:");
        println("-------------------------------------------");
        XianMutualInfluence xianMutualInfluence = new XianMutualInfluence();
        XianMutualInfluenceTests xianMutualInfluenceTests = new XianMutualInfluenceTests();

        String hasTheSameImage = xianMutualInfluenceTests.hasSameImage(xianMutualInfluence);
        println(hasTheSameImage);
        String hasTheSameImagePath = xianMutualInfluenceTests.hasTheSameImageClassPath(xianMutualInfluence);
        println(hasTheSameImagePath);
        println("-------------------------------------------");

        String hasTheSameElementName = xianMutualInfluenceTests.hasTheSameElementName(xianMutualInfluence);
        println(hasTheSameElementName);
        println("-------------------------------------------");

        String hasTheSameQualties = xianMutualInfluenceTests.hasTheSameElementQualities(xianMutualInfluence);
        println(hasTheSameQualties);
        println("-------------------------------------------");

        String hasTheSameDivination = xianMutualInfluenceTests.hasSameDivination(xianMutualInfluence);
        println(hasTheSameDivination);
        println("-------------------------------------------");

        String hasTheSameNumber = xianMutualInfluenceTests.hasSameNumber(xianMutualInfluence);
        println(hasTheSameNumber);
        println("-------------------------------------------");

    }

    public void testingHeng() {
        println("Testing Heng:");
        println("-------------------------------------------");
        Heng heng = new Heng();
        HengTests hengTests = new HengTests();

        String hengHasSameImage = hengTests.hasTheSameImage(heng);
        println(hengHasSameImage);
        println("-------------------------------------------");

        String hengHasTheSameImagePath = hengTests.hasSameImageClassPath(heng);
        println(hengHasTheSameImagePath);
        println("-------------------------------------------");

        String hengHasTheSameElementName = hengTests.hasTheSameElementName(heng);
        println(hengHasTheSameElementName);
        println("-------------------------------------------");

        String hengHasSameQualities = hengTests.hasTheSameQualities(heng);
        println(hengHasSameQualities);
        println("-------------------------------------------");

        String hasTheSameDivination = hengTests.hasTheSameDivination(heng);
        println(hasTheSameDivination);
        println("-------------------------------------------");

        String hasTheSameNumber = hengTests.hasTheSameNumber(heng);
        println(hasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingDun() {
        println("Testing Dun:");
        println("-------------------------------------------");
        Dun dun = new Dun();
        DunTests dunTests = new DunTests();

        String hasSameImage = dunTests.hasSameImage(dun);
        println(hasSameImage);
        String hasSameImagePath = dunTests.hasSameImagePath(dun);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = dunTests.hasTheSameElementName(dun);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = dunTests.hasTheSameQualities(dun);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = dunTests.hasTheSameDivination(dun);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = dunTests.hasTheSameNumber(dun);
        println(hasSameNumber);
        println("-------------------------------------------");

    }

    public void testingDaZhuang() {
        println("Testing Da Zhuang:");
        println("-------------------------------------------");

        DaZhuang daZhuang = new DaZhuang();
        DaZhuangTests daZhuangTests = new DaZhuangTests();

        String hasSameImage = daZhuangTests.hasSameImage(daZhuang);
        println(hasSameImage);
        String hasSameImagePath = daZhuangTests.hasSameImagePath(daZhuang);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = daZhuangTests.hasSameElementName(daZhuang);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = daZhuangTests.hasSameQualities(daZhuang);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = daZhuangTests.hasSameDivination(daZhuang);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = daZhuangTests.hasSameNumber(daZhuang);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingJinProgress() {
        println("Testing Jin Progress:");
        println("-------------------------------------------");
        JinProgress jinProgress = new JinProgress();
        JinProgressTests jinProgressTests = new JinProgressTests();

        String hasSameImage = jinProgressTests.hasSameImage(jinProgress);
        println(hasSameImage);
        String hasSameImagePath = jinProgressTests.hasSameImagePath(jinProgress);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameExpectedElement = jinProgressTests.hasSameElementName(jinProgress);
        println(hasSameExpectedElement);
        println("-------------------------------------------");

        String hasSameQualities = jinProgressTests.hasSameQualities(jinProgress);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = jinProgressTests.hasSameDivination(jinProgress);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = jinProgressTests.hasTheSameNumber(jinProgress);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingMingYi() {
        println("Testing Ming Yi");
        println("-------------------------------------------");
        MingYi mingYi = new MingYi();
        MingYiTests mingYiTests = new MingYiTests();

        String hasSameImage = mingYiTests.hasTheSameImage(mingYi);
        println(hasSameImage);
        String hasSameImagePath = mingYiTests.hasTheSameImagePath(mingYi);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = mingYiTests.hasTheSameElementName(mingYi);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = mingYiTests.hasTheSameQualities(mingYi);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = mingYiTests.hasSameDivination(mingYi);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = mingYiTests.hasSameNumber(mingYi);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingJiaRen() {
        println("Testing Jia Ren");
        println("-------------------------------------------");
        JiaRen jiaRen = new JiaRen();
        JiaRenTests jiaRenTests = new JiaRenTests();

        String hasSameImage = jiaRenTests.hasSameImage(jiaRen);
        println(hasSameImage);
        String hasTheSameImagePath = jiaRenTests.hasTheSameImagePath(jiaRen);
        println(hasTheSameImagePath);
        println("-------------------------------------------");

        String hasTheSameElementName = jiaRenTests.hasTheSameElementName(jiaRen);
        println(hasTheSameElementName);
        println("-------------------------------------------");

        String hasTheSameQualities = jiaRenTests.hasSameQualities(jiaRen);
        println(hasTheSameQualities);
        println("-------------------------------------------");

        String hasTheSameDivination = jiaRenTests.hasTheSameDivination(jiaRen);
        println(hasTheSameDivination);
        println("-------------------------------------------");

        String hasTheSameNumber = jiaRenTests.hasSameNumber(jiaRen);
        println(hasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingKuiOpposition() {
        println("Testing Kui Opposition");
        println("-------------------------------------------");
        KuiOpposition kuiOpposition = new KuiOpposition();
        KuiOppositionTests kuiOppositionTests = new KuiOppositionTests();

        String hasTheSameImage = kuiOppositionTests.hasSameImage(kuiOpposition);
        println(hasTheSameImage);
        String hasSameImagePath = kuiOppositionTests.hasSameImagePath(kuiOpposition);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = kuiOppositionTests.hasTheSameElementName(kuiOpposition);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = kuiOppositionTests.hasTheSameQualities(kuiOpposition);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = kuiOppositionTests.hasTheSameDivination(kuiOpposition);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = kuiOppositionTests.hasSameNumber(kuiOpposition);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingJianObstruction() {
        println("Testing Jian Obstruction");
        println("-------------------------------------------");
        JianObstruction jianObstruction = new JianObstruction();
        JianObstructionTests jianObstructionTests = new JianObstructionTests();

        String hasSameImage = jianObstructionTests.hasSameImage(jianObstruction);
        println(hasSameImage);
        String hasTheSameImagePath = jianObstructionTests.hasSameImagePath(jianObstruction);
        println(hasTheSameImagePath);
        println("-------------------------------------------");

        String hasTheSameElementName = jianObstructionTests.hasTheSameElementName(jianObstruction);
        println(hasTheSameElementName);
        println("-------------------------------------------");

        String hasTheSameQualities = jianObstructionTests.hasTheSameQualities(jianObstruction);
        println(hasTheSameQualities);
        println("-------------------------------------------");

        String hasTheSameDivination = jianObstructionTests.hasTheSameDivination(jianObstruction);
        println(hasTheSameDivination);
        println("-------------------------------------------");

        String hasTheSameNumber = jianObstructionTests.hasTheSameNumber(jianObstruction);
        println(hasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingJie() {
        println("Testing Jie");
        println("-------------------------------------------");
        Jie jie = new Jie();
        JieTests jieTests = new JieTests();

        String hasSameImage = jieTests.hasSameImage(jie);
        println(hasSameImage);
        String hasSameImagePath = jieTests.hasSameImagePath(jie);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = jieTests.hasSameElementName(jie);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = jieTests.hasSameQualities(jie);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = jieTests.hasSameDivination(jie);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = jieTests.hasSameNumber(jie);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingSun() {
        println("Testing Sun");
        println("-------------------------------------------");

        Sun sun = new Sun();
        SunTests sunTests = new SunTests();
        String hasSameImage = sunTests.hasSameImage(sun);
        println(hasSameImage);
        String hasSameImagePath = sunTests.hasSameImagePath(sun);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = sunTests.hasSameElementName(sun);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = sunTests.hasSameQualities(sun);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = sunTests.hasSameDivination(sun);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = sunTests.hasSameNumber(sun);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingYiIncrease() {
        println("Testing Yi Increase");
        println("-------------------------------------------");

        YiIncrease yiIncrease = new YiIncrease();
        YiIncreaseTests yiIncreaseTests = new YiIncreaseTests();

        String hasSameImage = yiIncreaseTests.hasSameImage(yiIncrease);
        println(hasSameImage);
        String hasSameImagePath = yiIncreaseTests.hasTheSameImagePath(yiIncrease);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = yiIncreaseTests.hasTheSameElementName(yiIncrease);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = yiIncreaseTests.hasTheSameQualities(yiIncrease);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = yiIncreaseTests.hasTheSameDivination(yiIncrease);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = yiIncreaseTests.hasTheSameNumber(yiIncrease);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingGuaiResolution() {
        println("Testing Guai Resolution");
        println("-------------------------------------------");

        GuaiResolution guaiResolution = new GuaiResolution();
        GuaiResolutionTests guaiResolutionTests = new GuaiResolutionTests();

        String hasSameImage = guaiResolutionTests.hasTheSameImage(guaiResolution);
        println(hasSameImage);
        String hasSameImagePath = guaiResolutionTests.hasTheSameImagePath(guaiResolution);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = guaiResolutionTests.hasSameElementName(guaiResolution);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasTheSameQualities = guaiResolutionTests.hasTheSameQualities(guaiResolution);
        println(hasTheSameQualities);
        println("-------------------------------------------");

        String hasTheSameDivination = guaiResolutionTests.hasTheSameDivination(guaiResolution);
        println(hasTheSameDivination);
        println("-------------------------------------------");

        String hasTheSameNumber = guaiResolutionTests.hasSameNumber(guaiResolution);
        println(hasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingGou() {
        println("Testing Gou");
        println("-------------------------------------------");

        Gou gou = new Gou();
        GouTests gouTests = new GouTests();

        String hasSameImage = gouTests.hasSameImage(gou);
        println(hasSameImage);
        String hasSameImagePath = gouTests.hasSameImagePath(gou);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = gouTests.hasTheSameElementName(gou);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualties =  gouTests.hasTheSameQualities(gou);
        println(hasSameQualties);
        println("-------------------------------------------");

        String hasSameDivination = gouTests.hasTheSameDivination(gou);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = gouTests.hasTheSameNumber(gou);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingCuiGathering() {
        println("Testing Cui Gathering");
        println("-------------------------------------------");

        CuiGatheringTogether cuiGatheringTogether = new CuiGatheringTogether();
        CuiGatheringTests cuiGatheringTests = new CuiGatheringTests();

        String hasTheSameImage = cuiGatheringTests.hasSameImage(cuiGatheringTogether);
        println(hasTheSameImage);
        String hasTheSameImagePath =  cuiGatheringTests.hasTheSameImagePath(cuiGatheringTogether);
        println(hasTheSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = cuiGatheringTests.hasTheSameElementName(cuiGatheringTogether);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = cuiGatheringTests.hasTheSameQualities(cuiGatheringTogether);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = cuiGatheringTests.hasTheSameDivination(cuiGatheringTogether);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = cuiGatheringTests.hasTheSameNumber(cuiGatheringTogether);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingShengAscending() {
        println("Testing Sheng Ascending");
        println("-------------------------------------------");

        ShengAscending shengAscending = new ShengAscending();
        ShengAscendingTests shengAscendingTests = new ShengAscendingTests();

        String hasSameImage = shengAscendingTests.hasSameImage(shengAscending);
        println(hasSameImage);
        String hasSameImagePath = shengAscendingTests.hasSameImagePath(shengAscending);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = shengAscendingTests.hasSameElementName(shengAscending);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = shengAscendingTests.hasSameQualities(shengAscending);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = shengAscendingTests.hasSameDivination(shengAscending);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = shengAscendingTests.hasSameNumber(shengAscending);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingKunOppression() {
        println("Testing Kun Oppression");
        println("-------------------------------------------");

        KunOppression kunOppression = new KunOppression();
        KunOppressionTests kunOppressionTests = new KunOppressionTests();

        String hasSameImage = kunOppressionTests.hasSameImage(kunOppression);
        println(hasSameImage);
        String hasSameImagePath = kunOppressionTests.hasSameImagePath(kunOppression);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = kunOppressionTests.hasSameElementName(kunOppression);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities =  kunOppressionTests.hasSameQualities(kunOppression);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = kunOppressionTests.hasTheSameDivination(kunOppression);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = kunOppressionTests.hasTheSameNumber(kunOppression);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingJing() {
        println("Testing Jing");
        println("-------------------------------------------");
        Jing jing = new Jing();
        JingTests jingTests = new JingTests();

        String hasTheSameImage = jingTests.hasSameImage(jing);
        println(hasTheSameImage);
        String hasTheSameImagePath = jingTests.hasTheSameImagePath(jing);
        println(hasTheSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = jingTests.hasTheSameElementName(jing);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = jingTests.hasTheSameQualities(jing);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = jingTests.hasTheSameDivination(jing);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = jingTests.hasSameNumber(jing);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingGeRevolution() {
        println("Testing Ge Revolution");
        println("-------------------------------------------");

        GeRevolution geRevolution = new GeRevolution();
        GeRevolutionTests geRevolutionTests = new GeRevolutionTests();

        String hasTheSameImage = geRevolutionTests.hasTheSameImage(geRevolution);
        println(hasTheSameImage);
        String hasTheSameImagePath = geRevolutionTests.hasTheSameImagePath(geRevolution);
        println(hasTheSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = geRevolutionTests.hasTheSameElementName(geRevolution);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasTheSameQualities = geRevolutionTests.hasTheSameQualities(geRevolution);
        println(hasTheSameQualities);
        println("-------------------------------------------");

        String hasTheSameDivination = geRevolutionTests.hasTheSameDivination(geRevolution);
        println(hasTheSameDivination);
        println("-------------------------------------------");

        String hasTheSameNumber = geRevolutionTests.hasTheSameNumber(geRevolution);
        println(hasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingDingTheCaldron() {
        println("Testing Ding");
        println("-------------------------------------------");

        DingTheCaldron dingTheCaldron = new DingTheCaldron();
        DingTests dingTests = new DingTests();
        String hasTheSameImage = dingTests.hasSameImage(dingTheCaldron);
        println(hasTheSameImage);
        String hasSameImagePath = dingTests.hasSameImagePath(dingTheCaldron);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = dingTests.hasTheSameElementName(dingTheCaldron);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = dingTests.hasTheSameElementQualities(dingTheCaldron);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = dingTests.hasTheSameDivination(dingTheCaldron);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = dingTests.hasTheSameNumber(dingTheCaldron);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingJianDevelopingGradually() {
        println("Testing Jian");
        println("-------------------------------------------");

        JianDevelopingGradually jian = new JianDevelopingGradually();
        JianDevelopingGraduallyTests jianTests = new JianDevelopingGraduallyTests();
        String isSamePicture = jianTests.hasSameImage(jian);
        println(isSamePicture);
        String isSameImagePath = jianTests.hasSameImagePath(jian);
        println(isSameImagePath);
        println("-------------------------------------------");

        String isSameElementName = jianTests.hasSameElement(jian);
        println(isSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = jianTests.hasSameQualities(jian);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = jianTests.hasSameDivination(jian);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = jianTests.hasTheSameNumber(jian);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingGuiMei(){
        println("Testing Gui Mei");
        println("-------------------------------------------");
        GuiMei guiMei = new GuiMei();
        GuiMeiTests guiMeiTests = new GuiMeiTests();
        String hasTheSameImage = guiMeiTests.isSameImage(guiMei);
        println(hasTheSameImage);
        String hasTheSameImagePath = guiMeiTests.hasSameImagePath(guiMei);
        println(hasTheSameImagePath);
        println("-------------------------------------------");

        String hasTheSameElementName = guiMeiTests.hasSameElementName(guiMei);
        println(hasTheSameElementName);
        println("-------------------------------------------");

        String hasTheSameQualities = guiMeiTests.hasTheSameElementQualities(guiMei);
        println(hasTheSameQualities);
        println("-------------------------------------------");

        String hasTheSameDivination = guiMeiTests.hasTheSameDivination(guiMei);
        println(hasTheSameDivination);
        println("-------------------------------------------");

        String hasTheSameNumber = guiMeiTests.hasTheSameNumber(guiMei);
        println(hasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingFeng() {
        println("Testing Feng");
        println("-------------------------------------------");

        Feng feng = new Feng();
        FengTests fengTests = new FengTests();
        String hasSameImage = fengTests.hasSameImage(feng);
        println(hasSameImage);
        String hasTheSameImagePath = fengTests.hasSameImagePath(feng);
        println(hasTheSameImagePath);
        println("-------------------------------------------");

        String hasTheSameElement = fengTests.hasSameElementName(feng);
        println(hasTheSameElement);
        println("-------------------------------------------");

        String hasTheSameQualities = fengTests.hasSameElementQualities(feng);
        println(hasTheSameQualities);
        println("-------------------------------------------");

        String hasTheSameDivination = fengTests.hasTheSameDivination(feng);
        println(hasTheSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = fengTests.hasTheSameNumber(feng);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingLuTheWanderer() {
        println("Testing Lu The Wanderer");
        println("-------------------------------------------");

        LuTheWanderer luTheWanderer = new LuTheWanderer();
        LuTheWandererTests luTheWandererTests = new LuTheWandererTests();
        String hasSameImage = luTheWandererTests.hasSameImage(luTheWanderer);
        println(hasSameImage);
        String hasSameImagePath = luTheWandererTests.hasTheSameImagePath(luTheWanderer);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElementName = luTheWandererTests.hasTheSameElements(luTheWanderer);
        println(hasSameElementName);
        println("-------------------------------------------");

        String hasSameQualities = luTheWandererTests.hasTheSameQualities(luTheWanderer);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = luTheWandererTests.hasTheSameDivination(luTheWanderer);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasTheSameNumber = luTheWandererTests.hasTheSameNumber(luTheWanderer);
        println(hasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingHuan() {
        println("Testing Huan");
        println("-------------------------------------------");
        Huan huan = new Huan();
        HuanTests huanTests = new HuanTests();

        String hasTheSameImage = huanTests.hasSameImage(huan);
        println(hasTheSameImage);
        String hasSameImagePath = huanTests.hasSameImagePath(huan);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElement = huanTests.hasSameElements(huan);
        println(hasSameElement);
        println("-------------------------------------------");

        String hasSameQualities = huanTests.hasSameQualities(huan);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasSameDivination = huanTests.hasTheSameDivination(huan);
        println(hasSameDivination);
        println("-------------------------------------------");

        String hasSameNumber = huanTests.hasTheSameNumber(huan);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingJieLimitation() {
        println("Testing Jie Limitation");
        println("-------------------------------------------");
        JieLimitation jieLimitation = new JieLimitation();
        JieLimitationTests jieLimitationTests = new JieLimitationTests();

        String hasSameImage = jieLimitationTests.hasSameImage(jieLimitation);
        println(hasSameImage);
        String hasSameImagePath = jieLimitationTests.hasSameImagePath(jieLimitation);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasTheSameElementName = jieLimitationTests.hasSameElement(jieLimitation);
        println(hasTheSameElementName);
        println("-------------------------------------------");

        String hasTheSameQualities = jieLimitationTests.hasTheSameQualities(jieLimitation);
        println(hasTheSameQualities);
        println("-------------------------------------------");

        String hasTheSameDivination = jieLimitationTests.hasTheSameDivination(jieLimitation);
        println(hasTheSameDivination);
        println("-------------------------------------------");

        String hasTheSameNumber = jieLimitationTests.hasTheSameNumber(jieLimitation);
        println(hasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingZhongFu() {
        println("Testing Zhong Fu");
        println("-------------------------------------------");

        ZhongFu zhongFu = new ZhongFu();
        ZhongFuTests zhongFuTests = new ZhongFuTests();

        String hasTheSameImage = zhongFuTests.hasSameImage(zhongFu);
        println(hasTheSameImage);
        String hasTheSameImagePath = zhongFuTests.hasSAmeImagePath(zhongFu);
        println(hasTheSameImagePath);
        println("-------------------------------------------");
        String hasTheSameElementName = zhongFuTests.hasSameElementName(zhongFu);
        println(hasTheSameElementName);
        println("-------------------------------------------");
        String hasTheSameQualities = zhongFuTests.hasTheSameQualities(zhongFu);
        println(hasTheSameQualities);
        println("-------------------------------------------");
        String hasTheSameDivination = zhongFuTests.hasTheSameDivination(zhongFu);
        println(hasTheSameDivination);
        println("-------------------------------------------");
        String hasTheSameNumber = zhongFuTests.hasTheSameNumber(zhongFu);
        println(hasTheSameNumber);
        println("-------------------------------------------");
    }

    public void testingXiaoGuo() {
        println("Testing Xiao Guo:");
        println("-------------------------------------------");
        XiaoGuo xiaoGuo = new XiaoGuo();
        XiaoGuoTests xiaoGuoTests = new XiaoGuoTests();

        String hasSameImage = xiaoGuoTests.hasSameImage(xiaoGuo);
        println(hasSameImage);
        String hasSameImagePath = xiaoGuoTests.hasSameImagePath(xiaoGuo);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElement = xiaoGuoTests.hasSameElement(xiaoGuo);
        println(hasSameElement);
        println("-------------------------------------------");

        String hasSameQualities = xiaoGuoTests.hasTheSameQualities(xiaoGuo);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasTheSameDivination = xiaoGuoTests.hasTheSameDivination(xiaoGuo);
        println(hasTheSameDivination);
        println("-------------------------------------------");

        String hasSameNumber =  xiaoGuoTests.hasTheSameNumber(xiaoGuo);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingJiji() {
        println("Testing Jiji:");
        println("-------------------------------------------");
        Jiji jiji = new Jiji();
        JijiTests jijiTests = new JijiTests();

        String hasSameImage = jijiTests.hasSameImage(jiji);
        println(hasSameImage);
        String hasSameImagePath = jijiTests.hasSameImagePath(jiji);
        println(hasSameImagePath);
        println("-------------------------------------------");


        String hasSameElement = jijiTests.hasTheSameElementName(jiji);
        println(hasSameElement);
        println("-------------------------------------------");

        String hasSameQualities = jijiTests.hasTheSameQualities(jiji);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasTheSameDivination = jijiTests.hasTheSameDivination(jiji);
        println(hasTheSameDivination);
        println("-------------------------------------------");

        String hasSameNumber =  jijiTests.hasTheSameNumber(jiji);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

    public void testingWeiJi() {
        println("Testing WeiJi:");
        println("-------------------------------------------");
        WeiJi weiJi = new WeiJi();
        WeiJiTests weiJiTests = new WeiJiTests();


        String hasSameImage = weiJiTests.hasSameImage(weiJi);
        println(hasSameImage);
        String hasSameImagePath = weiJiTests.hasTheSameImagePath(weiJi);
        println(hasSameImagePath);
        println("-------------------------------------------");

        String hasSameElement = weiJiTests.hasTheSameElement(weiJi);
        println(hasSameElement);
        println("-------------------------------------------");

        String hasSameQualities = weiJiTests.hasTheSameQualities(weiJi);
        println(hasSameQualities);
        println("-------------------------------------------");

        String hasTheSameDivination = weiJiTests.hasTheSameDivination(weiJi);
        println(hasTheSameDivination);
        println("-------------------------------------------");

        String hasSameNumber =  weiJiTests.hasSameNumber(weiJi);
        println(hasSameNumber);
        println("-------------------------------------------");
    }

}
