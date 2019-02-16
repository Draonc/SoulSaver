package dev.SoulSaver.gfx;


/**
 * Loads all the images needed in the game.
 */
import java.awt.image.BufferedImage;

public class Assets {

	private static final int width = 32, height = 32;

	// Houses
	public static BufferedImage flatG, flatS, flatR, flatO, turn1G, turn2G, turn1S, turn2S, turn1R, turn2R, turn1O,
								turn2O, serp1G, serp2G, serp3G, serp1S, serp2S, serp3S, serp1R, serp2R, serp3R, serp1O, serp2O, serp3O,
								door;
	// States
	public static BufferedImage menuBG, menuBGCS, intro, pauseBG, gameOverBG, loading, storyBG;

	// Weapons
	public static BufferedImage shieldSwordUp, shieldSwordDown, shieldSwordLeft, shieldSwordRight, fireIceSword, boomSwordHandle, boomSwordFull;
	public static BufferedImage[] fanSword, fireSword, iceSword, bowSword, boomSword, sword;

	// Characters
	public static BufferedImage[] player_downM1, player_upM1, player_leftM1, player_rightM1, fallM1;
	public static BufferedImage attack_rightM1, attack_upM1, attack_downM1, attack_leftM1;

	public static BufferedImage[] player_downTessema, player_upTessema, player_leftTessema, player_rightTessema, fallTessema;
	public static BufferedImage attack_rightTessema, attack_upTessema, attack_downTessema, attack_leftTessema;

	public static BufferedImage[] player_downF1, player_upF1, player_leftF1, player_rightF1, fallF1;
	public static BufferedImage attack_rightF1, attack_upF1, attack_downF1, attack_leftF1;

	public static BufferedImage[] player_downF2, player_upF2, player_leftF2, player_rightF2, fallF2;
	public static BufferedImage attack_rightF2, attack_upF2, attack_downF2, attack_leftF2;

	
	//NPC
	public static BufferedImage[] lady1_up, lady1_down, lady1_left, lady1_right;
	public static BufferedImage[] lady2_up, lady2_down, lady2_left, lady2_right;
	public static BufferedImage[] lady3_up, lady3_down, lady3_left, lady3_right;
	public static BufferedImage[] lady4_up, lady4_down, lady4_left, lady4_right;
	public static BufferedImage[] lady5_up, lady5_down, lady5_left, lady5_right;
	public static BufferedImage[] lady6_up, lady6_down, lady6_left, lady6_right;
	public static BufferedImage[] lady7_up, lady7_down, lady7_left, lady7_right;
	public static BufferedImage[] lady8_up, lady8_down, lady8_left, lady8_right;

	public static BufferedImage[] man1_up, man1_down, man1_left, man1_right;
	public static BufferedImage[] man2_up, man2_down, man2_left, man2_right;
	public static BufferedImage[] man3_up, man3_down, man3_left, man3_right;
	public static BufferedImage[] man4_up, man4_down, man4_left, man4_right;
	public static BufferedImage[] man5_up, man5_down, man5_left, man5_right;
	public static BufferedImage[] man6_up, man6_down, man6_left, man6_right;
	public static BufferedImage[] man7_up, man7_down, man7_left, man7_right;
	public static BufferedImage[] man8_up, man8_down, man8_left, man8_right;
	
	public static BufferedImage[] child1_up, child1_down, child1_left, child1_right;
	public static BufferedImage[] child2_up, child2_down, child2_left, child2_right;
	public static BufferedImage[] child3_up, child3_down, child3_left, child3_right;
	public static BufferedImage[] child4_up, child4_down, child4_left, child4_right;
	
	// Animals
	public static BufferedImage[] dog_up, dog_down, dog_left, dog_right;
	public static BufferedImage[] cat_up, cat_down, cat_left, cat_right;
	public static BufferedImage[] cow_up, cow_down, cow_left, cow_right;
	public static BufferedImage[] fox_up, fox_down, fox_left, fox_right;
	public static BufferedImage[] horseBrown_up, horseBrown_down, horseBrown_left, horseBrown_right;
	public static BufferedImage[] horseWhite_up, horseWhite_down, horseWhite_left, horseWhite_right;
	public static BufferedImage[] sheep_up, sheep_down, sheep_left, sheep_right;
	public static BufferedImage[] runSoul_down, runSoul_up, runSoul_left, runSoul_right;
	public static BufferedImage[] passSoul_down, passSoul_up, passSoul_left, passSoul_right;
	public static BufferedImage[] attackSoul_down, attackSoul_up, attackSoul_left, attackSoul_right;
	public static BufferedImage[] gorilla_Up, gorilla_Left, gorilla_Right;

	// Monsters
	// Archers
	public static BufferedImage[] spider_down, spider_up, spider_left, spider_right;
	public static BufferedImage web;
	public static BufferedImage[] dragonA_down, dragonA_up, dragonA_left, dragonA_right;
	public static BufferedImage fireBlast;
	public static BufferedImage[] sludgeManA_down, sludgeManA_up, sludgeManA_left, sludgeManA_right;
	public static BufferedImage sludgeBomb;
	public static BufferedImage[] octopus_down, octopus_up, octopus_left, octopus_right;
	public static BufferedImage ink;
	public static BufferedImage[] skeletonA_down, skeletonA_up, skeletonA_left, skeletonA_right;
	public static BufferedImage arrow;
	public static BufferedImage[] bee_down, bee_up, bee_left, bee_right;
	public static BufferedImage stinger;
	public static BufferedImage[] angelA_down, angelA_up, angelA_left, angelA_right;
	public static BufferedImage[] tronA_down, tronA_up, tronA_left, tronA_right;
	public static BufferedImage tronDiscE, tronDiscP;

	// Flying
	public static BufferedImage[] bat_down, bat_up, bat_left, bat_right;
	public static BufferedImage[] batI_down, batI_up, batI_left, batI_right;
	public static BufferedImage[] batF_down, batF_up, batF_left, batF_right;
	public static BufferedImage[] crow_down, crow_up, crow_left, crow_right;
	public static BufferedImage[] flyFish_down, flyFish_up, flyFish_left, flyFish_right;
	public static BufferedImage[] floatHead_down, floatHead_up, floatHead_left, floatHead_right;
	public static BufferedImage[] dove_down, dove_up, dove_left, dove_right;

	// Normal
	public static BufferedImage[] dragonN_down, dragonN_up, dragonN_left, dragonN_right;
	public static BufferedImage[] weasel_down, weasel_up, weasel_left, weasel_right;
	public static BufferedImage[] plantS_down, plantS_up, plantS_left, plantS_right;
	public static BufferedImage[] vampire_down, vampire_up, vampire_left, vampire_right;
	public static BufferedImage[] fishman_down, fishman_up, fishman_left, fishman_right;
	public static BufferedImage[] skeleton_down, skeleton_up, skeleton_left, skeleton_right;
	public static BufferedImage[] plantF_down, plantF_up, plantF_left, plantF_right;
	public static BufferedImage[] cloudRat_down, cloudRat_up, cloudRat_left, cloudRat_right;
	public static BufferedImage[] tronN_down, tronN_up, tronN_left, tronN_right;

	// Laser
	public static BufferedImage statueL_down, statueL_up, statueL_left, statueL_right;
	public static BufferedImage sandLaser;
	public static BufferedImage orb;
	public static BufferedImage iceLaser;
	public static BufferedImage picture_down, picture_up, picture_left, picture_right;
	public static BufferedImage pictureLaser;
	public static BufferedImage cannon_down, cannon_up, cannon_left, cannon_right;
	public static BufferedImage cannonLaser;
	public static BufferedImage poleHead_down, poleHead_up, poleHead_left, polHead_right;
	public static BufferedImage dungeonLaser;
	public static BufferedImage treeL;
	public static BufferedImage treeLaser;
	public static BufferedImage rainPiller;
	public static BufferedImage rainLaser;
	public static BufferedImage digitalPiller;
	public static BufferedImage digitalLaser;

	// Trail
	public static BufferedImage[] scorpion_down, scorpion_up, scorpion_left, scorpion_right;
	public static BufferedImage sandTrail;
	public static BufferedImage[] blobI_down, blobI_up, blobI_left, blobI_right;
	public static BufferedImage iceTrail;
	public static BufferedImage[] blobF_down, blobF_up, blobF_left, blobF_right;
	public static BufferedImage fireTrail;
	public static BufferedImage[] sludgeManT_down, sludgeManT_up, sludgeManT_left, sludgeManT_right;
	public static BufferedImage sludgeTrail;
	public static BufferedImage[] ghost_down, ghost_up, ghost_left, ghost_right;
	public static BufferedImage ghostTrail;
	public static BufferedImage[] blobS_down, blobS_up, blobS_left, blobS_right;
	public static BufferedImage swampTrail;
	public static BufferedImage[] slug_down, slug_up, slug_left, slug_right;
	public static BufferedImage slugTrail;
	public static BufferedImage[] cloud_down, cloud_up, cloud_left, cloud_right;
	public static BufferedImage cloudTrail;
	public static BufferedImage[] tronBike_down, tronBike_up, tronBike_left, tronBike_right;
	public static BufferedImage tronBikeTrail;

	// Leash
	public static BufferedImage[] rat_down, rat_up, rat_left, rat_right;
	public static BufferedImage[] frog_down, frog_up, frog_left, frog_right;
	public static BufferedImage[] wolf_down, wolf_up, wolf_left, wolf_right;
	public static BufferedImage[] snake_down, snake_up, snake_left, snake_right;
	public static BufferedImage[] ghostDog_down, ghostDog_up, ghostDog_left, ghostDog_right;
	public static BufferedImage[] plantDog_down, plantDog_up, plantDog_left, plantDog_right;
	public static BufferedImage[] cloudDog_down, cloudDog_up, cloudDog_left, cloudDog_right;

	// Armor
	public static BufferedImage[] iceManA_down, iceManA_up, iceManA_left, iceManA_right;
	public static BufferedImage[] stoneSludge_down, stoneSludge_up, stoneSludge_left, stoneSludge_right;
	public static BufferedImage[] knight_down, knight_up, knight_left, knight_right;
	public static BufferedImage[] knightSkel_down, knightSkel_up, knightSkel_left, knightSkel_right;
	public static BufferedImage[] ent_down, ent_up, ent_left, ent_right;
	public static BufferedImage[] tron_down, tron_up, tron_left, tron_right;

	// Mirror
	public static BufferedImage[] sandStatue_down, sandStatue_up, sandStatue_left, sandStatue_right;
	public static BufferedImage[] iceManM_down, iceManM_up, iceManM_left, iceManM_right;
	public static BufferedImage[] sludgeMirror_down, sludgeMirror_up, sludgeMirror_left, sludgeMirror_right;
	public static BufferedImage[] knightStatue_down, knightStatue_up, knightStatue_left, knightStatue_right;
	public static BufferedImage[] woodStatue_down, woodStatue_up, woodStatue_left, woodStatue_right;
	public static BufferedImage[] skelStatue_down, skelStatue_up, skelStatue_left, skelStatue_right;
	public static BufferedImage[] vineMan_down, vineMan_up, vineMan_left, vineMan_right;
	public static BufferedImage[] angelStatue_down, angelStatue_up, angelStatue_left, angelStatue_right;
	public static BufferedImage[] tronM_down, tronM_up, tronM_left, tronM_right;

	// Tiles
	public static BufferedImage grass, dirt, flower, grassToDirtTL, grassToDirtTM, grassToDirtTR, grassToDirtML,
								grassToDirtMR, grassToDirtBL, grassToDirtBM, grassToDirtBR, grassToFlowerTL, grassToFlowerTM, 
								grassToFlowerTR, grassToFlowerML, grassToFlowerMR, grassToFlowerBL, grassToFlowerBM,
								grassToFlowerBR, mazeFloor, mazeWallTop, mazeWallBottom, mazeWallLeft, mazeWallRight,
								mazeWallTL, mazeWallTR, mazeWallBL, mazeWallBR, iceFloor1, iceFloor2, iceWallTop, iceWallBottom, 
								iceWallLeft, iceWallRight, iceWallTL, iceWallTR, iceWallBL, iceWallBR, iceSlide, fireFloor1,
								fireFloor2, fireWallTop, fireWallBottom, fireWallRight, fireWallLeft, fireWallTL, fireWallTR,
								fireWallBL, fireWallBR, lava, digitalFloor, digitalWall, vines, swampDirt, tarBubble, tarBubblePop,
								tar, swampWallTL, swampWallTM, swampWallTR, swampWallML, swampWallMR, swampWallBL, swampWallBM,
								swampWallBR, carpetBorderTL, carpetBorderTM, carpetBorderTR, carpetBorderMR, carpetBorderML, 
								carpetBorderBL, carpetBorderBM, carpetBorderBR, carpet, carpetHole, wood, woodHole, mansionWallTL,
								mansionWallTM, mansionWallTR, mansionWallBL, mansionWallBM, mansionWallBR, mansionWallBorderTL,
								mansionWallBorderTM, mansionWallBorderTR, mansionWallBorderML, mansionWallBorderMR, mansionWallBorderBL,
								mansionWallBorderBM, mansionWallBorderBR, riverTL, riverTM, riverTR, riverML, riverMM, riverMR, riverBL,
								riverBM, riverBR, treeClusterTL, treeClusterTR, treeClusterBL, treeClusterBR, treeTR, treeTL, treeBR, treeBL,
								dungeonWallTL, dungeonWallTM, dungeonWallTR, dungeonWallBL, dungeonWallBM, dungeonWallBR, dungeonFloor, dungeonBorderTL,
								dungeonBorderTM, dungeonBorderTR, dungeonBorderML, dungeonBorderMR, dungeonBorderBL, dungeonBorderBM, dungeonBorderBR,
								cloudFloor, cloudWallTop, cloudWallBottom, cloudWallLeft, cloudWallRight, cloudWallTL, cloudWallTR, cloudWallBL,
								cloudWallBR, shipFloor, shipWallTL, shipWallTM, shipWallTR, shipWallBL, shipWallBM, shipWallBR, shipBorderBlankTopL,
								shipBorderBlankMiddleL, shipBorderBlankBottomL, shipBorderBlankTopR, shipBorderBlankMiddleR, shipBorderBlankBottomR,
								shipBorderWaterTopL, shipBorderWaterMiddleL, shipBorderWaterBottomL, shipBorderWaterTopR, shipBorderWaterMiddleR,
								shipBorderWaterBottomR, water, tilePit, blank, stairsLeft, stairsRight, stairsMiddle, stairsFull, houseWallTL, houseWallTM,
								houseWallTR, houseWallBL, houseWallBM, houseWallBR, houseFloor, houseWallBorderTL, houseWallBorderTM, houseWallBorderTR, 
								houseWallBorderML, houseWallBorderMR, houseWallBorderBL, houseWallBorderBM, houseWallBorderBR, mazeCornerTL, mazeCornerTR,
								mazeCornerBL, mazeCornerBR, shipBorderCornerBR, shipBorderCornerBL, shipBorderBottomL, shipBorderBottomM, shipBorderBottomR, sky, 
								cobbleFloor, brokenCobbleFloor, crackedStairs, houseBorderTLCorner, houseBorderTRCorner, houseBorderBLCorner, houseBorderBRCorner,
								dungeonBorderTLCorner, dungeonBorderTRCorner, dungeonBorderBLCorner, dungeonBorderBRCorner; 
	
	public static BufferedImage transportDoor, heavenEntrance;
	
	// Items
	public static BufferedImage heartFull, heartEmpty, key, bossKey, chestOpen, chestClosed, potion, selectionBox, fanBlast;
	public static BufferedImage switchOpen, switchClosed, crackOpened, crackClosed;
	public static BufferedImage coin1, coin2, coin5, coin10, bomb, textBox, slot;
	
	public static BufferedImage airPiller, soldOut, shelfShopLeft, shelfShopRight, shelfShopBottom, fenceSide, fenceFull;
	public static BufferedImage buttonA, buttonB, buttonUp, buttonDown, buttonLeft, buttonRight;

	public static BufferedImage[] explosion, bombExplosion;
	// Maze
	public static BufferedImage mazeEntrance;
	public static BufferedImage fountain, skeleton, mazeStatue, mazePit, mazeCrate, mazeWallTemp, target;
	public static BufferedImage mazeButtonUnpressed, mazeButtonPressed;

	// Fire Ice
	public static BufferedImage fire_IceEntrance;
	public static BufferedImage fireDragon, iceDragon;
	public static BufferedImage icePillerS, icePillerM, icePillerL, firePillerL, firePillerM, meltPiller, puddle,
								iceBlock, fireIceCrate, fireSwitch, iceSwitch, fireIceButtonUnpressed, fireIceButtonPressed;
	public static BufferedImage[] crackFloor;

	// Digital
	public static BufferedImage digitalEntrance;
	public static BufferedImage tronPiller, digitalCrate, digitalTempWall;
	public static BufferedImage digitalButtonUnpressed, digitalButtonPressed;
	// Swamp
	public static BufferedImage swampEntrance;
	public static BufferedImage vine, mushroom, lilyPad, lilyPads, swampTree, swampCrate, swampLog;
	public static BufferedImage swampButtonUnpressed, swampButtonPressed;

	// Mansion
	public static BufferedImage mansionEntrance;
	public static BufferedImage diningChairLeft, diningChairRight, diningChairUp, diningChairDown, bookshelf, toilet,
								dresserLeft, dresserRight, dresserDown, candle, nightstand, sink, bed, foodShelf, clock, candle2,
								stoolFancy, wallshelf, coffin, sofaLeft, sofaRight, chairLeft, chairRight, chairrDown, chairUp, table,
								diningtable, bathtub, lightTargetLit, lightTargetUnlit, throne, piano, fireplace, light, windowOpen,
								windowClosed, mansionCrate, mansionBanisterBroken, mansionBanister, mansionBanisterLeft, mansionBanisterRight,
								mansionButtonUnpressed, mansionButtonPressed, mansionTempWall;
	public static BufferedImage[] fire, blackFire;

	// Forest
	public static BufferedImage forestEntrance;
	public static BufferedImage tree, leafPile, forestCrate, bramble, brokenPiller1, brokenPiller2, wallRuinsB, wallRuinsS,
								forestButtonUnpressed, forestButtonPressed;
	public static BufferedImage[] fanAuto;

	// Dungeon
	public static BufferedImage DungeonEntrance;
	public static BufferedImage bossDoor, dungeonDoorLUp, dungeonDoorLDown, dungeonDoorLLeft, dungeonDoorLRight,
								dungeonDoorUUp, dungeonDoorUDown, dungeonDoorULeft, dungeonDoorURight, dungeonTempWall;
	public static BufferedImage dungeonCrate, skeletonHanging, bonePile;

	public static BufferedImage dungeonButtonUnpressed, dungeonButtonPressed;

	// Sky
	public static BufferedImage skyEntrance;
	public static BufferedImage skyCrate, skyTempWall;
	public static BufferedImage skyButtonUnpressed, skyButtonPressed;

	// Ship
	public static BufferedImage shipEntrance;
	public static BufferedImage shipCrate, ropeLadderUp, ropeLadderDown, map, sackStack, openSack, mast, jailWall, shipWheel, ropeCoil, 
								brokenTable, anchor, shipBanisterBroken, shipBanister, shipBanisterLeft, shipBanisterRight, shipAft, shipBow,
								shipBanisterV, shipBanisterTop, shipBanisterBottom, shipHole, climbRope, crackedShipFloor, shipTempWall;
	public static BufferedImage shipButtonUnpressed, shipButtonPressed;
	
	//Random
	public static BufferedImage hole, bedS, washBucket, stump, stool, cart, well, outhouse, sign, clockS, dresserS, hayStack, waterTrough, hayTrough,
								field, tableP, rug, shelfLeft, shelfMiddle, shelfRight, riddleWood, riddleStone;

	public static void init() {
		// Chracters
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Entities.png"));

		// Player Male 1
		player_downM1 = new BufferedImage[4];
		player_upM1 = new BufferedImage[4];
		player_leftM1 = new BufferedImage[4];
		player_rightM1 = new BufferedImage[4];
		fallM1 = new BufferedImage[4];

		player_downM1[0] = sheet.crop(0, 0, width, height);
		player_downM1[1] = sheet.crop(width, 0, width, height);
		player_downM1[2] = sheet.crop(width * 2, 0, width, height);
		player_downM1[3] = sheet.crop(width * 3, 0, width, height);
		player_upM1[0] = sheet.crop(0, height * 3, width, height);
		player_upM1[1] = sheet.crop(width, height * 3, width, height);
		player_upM1[2] = sheet.crop(width * 2, height * 3, width, height);
		player_upM1[3] = sheet.crop(width * 3, height * 3, width, height);
		player_rightM1[0] = sheet.crop(0, height * 2, width, height);
		player_rightM1[1] = sheet.crop(width, height * 2, width, height);
		player_rightM1[2] = sheet.crop(width * 2, height * 2, width, height);
		player_rightM1[3] = sheet.crop(width, height * 2, width, height);
		player_leftM1[0] = sheet.crop(0, height, width, height);
		player_leftM1[1] = sheet.crop(width, height, width, height);
		player_leftM1[2] = sheet.crop(width * 2, height, width, height);
		player_leftM1[3] = sheet.crop(width, height, width, height);

		attack_downM1 = sheet.crop(width * 4, 0, width, height);
		attack_upM1 = sheet.crop(width * 4, height * 3, width, height);
		attack_leftM1 = sheet.crop(width * 2, height, width, height);
		attack_rightM1 = sheet.crop(width * 2, height * 2, width, height);

		fallM1[0] = sheet.crop(width * 3, height, width, height);
		fallM1[1] = sheet.crop(width * 4, height, width, height);
		fallM1[2] = sheet.crop(width * 5, height, width, height);
		fallM1[3] = sheet.crop(width * 6, height, width, height);

		// Player Male 2
		player_downTessema = new BufferedImage[4];
		player_upTessema = new BufferedImage[4];
		player_leftTessema = new BufferedImage[4];
		player_rightTessema = new BufferedImage[4];
		fallTessema = new BufferedImage[4];

		player_downTessema[0] = sheet.crop(0, height * 4, width, height);
		player_downTessema[1] = sheet.crop(width, height * 4, width, height);
		player_downTessema[2] = sheet.crop(width * 2, height * 4, width, height);
		player_downTessema[3] = sheet.crop(width, height * 4, width, height);
		player_upTessema[0] = sheet.crop(0, height * 7, width, height);
		player_upTessema[1] = sheet.crop(width, height * 7, width, height);
		player_upTessema[2] = sheet.crop(width * 2, height * 7, width, height);
		player_upTessema[3] = sheet.crop(width, height * 7, width, height);
		player_rightTessema[0] = sheet.crop(0, height * 6, width, height);
		player_rightTessema[1] = sheet.crop(width, height * 6, width, height);
		player_rightTessema[2] = sheet.crop(width * 2, height * 6, width, height);
		player_rightTessema[3] = sheet.crop(width, height * 6, width, height);
		player_leftTessema[0] = sheet.crop(0, height * 5, width, height);
		player_leftTessema[1] = sheet.crop(width, height * 5, width, height);
		player_leftTessema[2] = sheet.crop(width * 2, height * 5, width, height);
		player_leftTessema[3] = sheet.crop(width, height * 5, width, height);

		attack_downTessema = sheet.crop(width * 4, height * 4, width, height);
		attack_upTessema = sheet.crop(width * 4, height * 7, width, height);
		attack_leftTessema = sheet.crop(width * 2, height * 5, width, height);
		attack_rightTessema = sheet.crop(width * 2, height * 6, width, height);

		fallTessema[0] = sheet.crop(width * 3, height * 5, width, height);
		fallTessema[1] = sheet.crop(width * 4, height * 5, width, height);
		fallTessema[2] = sheet.crop(width * 5, height * 5, width, height);
		fallTessema[3] = sheet.crop(width * 6, height * 5, width, height);

		// Player Female 1
		player_downF1 = new BufferedImage[4];
		player_upF1 = new BufferedImage[4];
		player_leftF1 = new BufferedImage[4];
		player_rightF1 = new BufferedImage[4];
		fallF1 = new BufferedImage[4];

		player_downF1[0] = sheet.crop(0, height * 8, width, height);
		player_downF1[1] = sheet.crop(width, height * 8, width, height);
		player_downF1[2] = sheet.crop(width * 2, height * 8, width, height);
		player_downF1[3] = sheet.crop(width, height * 8, width, height);
		player_upF1[0] = sheet.crop(0, height * 11, width, height);
		player_upF1[1] = sheet.crop(width, height * 11, width, height);
		player_upF1[2] = sheet.crop(width * 2, height * 11, width, height);
		player_upF1[3] = sheet.crop(width, height * 11, width, height);
		player_rightF1[0] = sheet.crop(0, height * 10, width, height);
		player_rightF1[1] = sheet.crop(width, height * 10, width, height);
		player_rightF1[2] = sheet.crop(width * 2, height * 10, width, height);
		player_rightF1[3] = sheet.crop(width, height * 10, width, height);
		player_leftF1[0] = sheet.crop(0, height * 9, width, height);
		player_leftF1[1] = sheet.crop(width, height * 9, width, height);
		player_leftF1[2] = sheet.crop(width * 2, height * 9, width, height);
		player_leftF1[3] = sheet.crop(width, height * 9, width, height);

		attack_downF1 = sheet.crop(width * 4, height * 8, width, height);
		attack_upF1 = sheet.crop(width * 4, height * 11, width, height);
		attack_leftF1 = sheet.crop(width * 2, height * 9, width, height);
		attack_rightF1 = sheet.crop(width * 2, height * 10, width, height);

		fallF1[0] = sheet.crop(width * 3, height * 9, width, height);
		fallF1[1] = sheet.crop(width * 4, height * 9, width, height);
		fallF1[2] = sheet.crop(width * 5, height * 9, width, height);
		fallF1[3] = sheet.crop(width * 6, height * 9, width, height);

		// Player Female 2
		player_downF2 = new BufferedImage[4];
		player_upF2 = new BufferedImage[4];
		player_leftF2 = new BufferedImage[4];
		player_rightF2 = new BufferedImage[4];
		fallF2 = new BufferedImage[4];

		player_downF2[0] = sheet.crop(0, height * 12, width, height);
		player_downF2[1] = sheet.crop(width, height * 12, width, height);
		player_downF2[2] = sheet.crop(width * 2, height * 12, width, height);
		player_downF2[3] = sheet.crop(width, height * 12, width, height);
		player_upF2[0] = sheet.crop(0, height * 15, width, height);
		player_upF2[1] = sheet.crop(width, height * 15, width, height);
		player_upF2[2] = sheet.crop(width * 2, height * 15, width, height);
		player_upF2[3] = sheet.crop(width, height * 15, width, height);
		player_rightF2[0] = sheet.crop(0, height * 14, width, height);
		player_rightF2[1] = sheet.crop(width, height * 14, width, height);
		player_rightF2[2] = sheet.crop(width * 2, height * 14, width, height);
		player_rightF2[3] = sheet.crop(width, height * 14, width, height);
		player_leftF2[0] = sheet.crop(0, height * 13, width, height);
		player_leftF2[1] = sheet.crop(width, height * 13, width, height);
		player_leftF2[2] = sheet.crop(width * 2, height * 13, width, height);
		player_leftF2[3] = sheet.crop(width, height * 13, width, height);

		attack_downF2 = sheet.crop(width * 4, height * 12, width, height);
		attack_upF2 = sheet.crop(width * 4, height * 15, width, height);
		attack_leftF2 = sheet.crop(width * 2, height * 13, width, height);
		attack_rightF2 = sheet.crop(width * 2, height * 14, width, height);

		fallF2[0] = sheet.crop(width * 3, height * 13, width, height);
		fallF2[1] = sheet.crop(width * 4, height * 13, width, height);
		fallF2[2] = sheet.crop(width * 5, height * 13, width, height);
		fallF2[3] = sheet.crop(width * 6, height * 13, width, height);

		// Weapons
		sword = new BufferedImage[2];
		fireSword = new BufferedImage[2];
		iceSword = new BufferedImage[2];
		fanSword = new BufferedImage[3];
		bowSword = new BufferedImage[2];
		boomSword = new BufferedImage[2];

		sword[0] = sheet.crop(width * 7, height, width, height);
		sword[1] = sheet.crop(width * 7, 0, width, height);

		fireSword[0] = sheet.crop(width * 9, height, width, height);
		fireSword[1] = sheet.crop(width * 9, 0, width, height);

		iceSword[0] = sheet.crop(width * 8, height, width, height);
		iceSword[1] = sheet.crop(width * 8, 0, width, height);

		bowSword[1] = sheet.crop(width * 10, height * 2, width, height);
		bowSword[0] = sheet.crop(width * 11, height * 2, width, height);

		fanSword[2] = sheet.crop(width * 9, height * 2, width, height);
		fanSword[1] = sheet.crop(width * 8, height * 2, width, height);
		fanSword[0] = sheet.crop(width * 7, height * 2, width, height);
		
		shieldSwordUp = sheet.crop(width * 11, height, width, height);
		shieldSwordDown = sheet.crop(width * 11 ,0 , width, height);
		shieldSwordLeft = sheet.crop(width * 12, 0, width, height);
		shieldSwordRight = sheet.crop(width * 12, height, width, height);
		
		fireIceSword = sheet.crop(width * 6, 0, width, height);
		boomSwordHandle = sheet.crop(width * 10, height, width, height);
		boomSwordFull  = sheet.crop(width * 10, 0, width, height);
		
		boomSword = new BufferedImage[4];
		
		boomSword[0]  = sheet.crop(width * 6, height * 2, width/2, height/2);
		boomSword[1]  = sheet.crop(width * 6, (height * 2) + 16, width/2, height/2);
		boomSword[2]  = sheet.crop((width * 6) + 16, (height * 2) + 16, width/2, height/2);
		boomSword[3]  = sheet.crop((width * 6) + 16, height * 2, width/2, height/2);
		
		

		//NPC
		lady1_up = new BufferedImage[3];
		lady1_down = new BufferedImage[3];
		lady1_left = new BufferedImage[3];
		lady1_right = new BufferedImage[3];
		
		lady1_down[0] = sheet.crop(width * 7, height * 4, width, height);
		lady1_down[1] = sheet.crop(width * 8, height * 4, width, height);
		lady1_down[2] = sheet.crop(width * 9, height * 4, width, height);
		lady1_up[0] = sheet.crop(width * 7, height * 7, width, height);
		lady1_up[1] = sheet.crop(width * 8, height * 7, width, height);
		lady1_up[2] = sheet.crop(width * 9, height * 7, width, height);
		lady1_left[0] = sheet.crop(width * 7, height * 5, width, height);
		lady1_left[1] = sheet.crop(width * 8, height * 5, width, height);
		lady1_left[2] = sheet.crop(width * 9, height * 5, width, height);
		lady1_right[0] = sheet.crop(width * 7, height * 6, width, height);
		lady1_right[1] = sheet.crop(width * 8, height * 6, width, height);
		lady1_right[2] = sheet.crop(width * 9, height * 6, width, height);
		
		lady2_up = new BufferedImage[3];
		lady2_down = new BufferedImage[3];
		lady2_left = new BufferedImage[3];
		lady2_right = new BufferedImage[3];
		
		lady2_down[0] = sheet.crop(width * 10, height * 4, width, height);
		lady2_down[1] = sheet.crop(width * 11, height * 4, width, height);
		lady2_down[2] = sheet.crop(width * 12, height * 4, width, height);
		lady2_up[0] = sheet.crop(width * 10, height * 7, width, height);
		lady2_up[1] = sheet.crop(width * 11, height * 7, width, height);
		lady2_up[2] = sheet.crop(width * 12, height * 7, width, height);
		lady2_left[0] = sheet.crop(width * 10, height * 5, width, height);
		lady2_left[1] = sheet.crop(width * 11, height * 5, width, height);
		lady2_left[2] = sheet.crop(width * 12, height * 5, width, height);
		lady2_right[0] = sheet.crop(width * 10, height * 6, width, height);
		lady2_right[1] = sheet.crop(width * 11, height * 6, width, height);
		lady2_right[2] = sheet.crop(width * 12, height * 6, width, height);
		
		lady3_up = new BufferedImage[3];
		lady3_down = new BufferedImage[3];
		lady3_left = new BufferedImage[3];
		lady3_right = new BufferedImage[3];
		
		lady3_down[0] = sheet.crop(width * 13, height * 4, width, height);
		lady3_down[1] = sheet.crop(width * 14, height * 4, width, height);
		lady3_down[2] = sheet.crop(width * 15, height * 4, width, height);
		lady3_up[0] = sheet.crop(width * 13, height * 7, width, height);
		lady3_up[1] = sheet.crop(width * 14, height * 7, width, height);
		lady3_up[2] = sheet.crop(width * 15, height * 7, width, height);
		lady3_left[0] = sheet.crop(width * 13, height * 5, width, height);
		lady3_left[1] = sheet.crop(width * 14, height * 5, width, height);
		lady3_left[2] = sheet.crop(width * 15, height * 5, width, height);
		lady3_right[0] = sheet.crop(width * 13, height * 6, width, height);
		lady3_right[1] = sheet.crop(width * 14, height * 6, width, height);
		lady3_right[2] = sheet.crop(width * 15, height * 6, width, height);
		
		lady4_up = new BufferedImage[3];
		lady4_down = new BufferedImage[3];
		lady4_left = new BufferedImage[3];
		lady4_right = new BufferedImage[3];
		
		lady4_down[0] = sheet.crop(width * 13, 0, width, height);
		lady4_down[1] = sheet.crop(width * 14, 0, width, height);
		lady4_down[2] = sheet.crop(width * 15, 0, width, height);
		lady4_up[0] = sheet.crop(width * 13, height * 3, width, height);
		lady4_up[1] = sheet.crop(width * 14, height * 3, width, height);
		lady4_up[2] = sheet.crop(width * 15, height * 3, width, height);
		lady4_left[0] = sheet.crop(width * 13, height, width, height);
		lady4_left[1] = sheet.crop(width * 14, height, width, height);
		lady4_left[2] = sheet.crop(width * 15, height, width, height);
		lady4_right[0] = sheet.crop(width * 13, height * 2, width, height);
		lady4_right[1] = sheet.crop(width * 14, height * 2, width, height);
		lady4_right[2] = sheet.crop(width * 15, height * 2, width, height);
		
		lady5_up = new BufferedImage[3];
		lady5_down = new BufferedImage[3];
		lady5_left = new BufferedImage[3];
		lady5_right = new BufferedImage[3];
		
		lady5_down[0] = sheet.crop(width * 16, 0, width, height);
		lady5_down[1] = sheet.crop(width * 17, 0, width, height);
		lady5_down[2] = sheet.crop(width * 18, 0, width, height);
		lady5_up[0] = sheet.crop(width * 16, height * 3, width, height);
		lady5_up[1] = sheet.crop(width * 17, height * 3, width, height);
		lady5_up[2] = sheet.crop(width * 18, height * 3, width, height);
		lady5_left[0] = sheet.crop(width * 16, height, width, height);
		lady5_left[1] = sheet.crop(width * 17, height, width, height);
		lady5_left[2] = sheet.crop(width * 18, height, width, height);
		lady5_right[0] = sheet.crop(width * 16, height * 2, width, height);
		lady5_right[1] = sheet.crop(width * 17, height * 2, width, height);
		lady5_right[2] = sheet.crop(width * 18, height * 2, width, height);
		
		lady6_up = new BufferedImage[3];
		lady6_down = new BufferedImage[3];
		lady6_left = new BufferedImage[3];
		lady6_right = new BufferedImage[3];
		
		lady6_down[0] = sheet.crop(width * 16, height * 4, width, height);
		lady6_down[1] = sheet.crop(width * 17, height * 4, width, height);
		lady6_down[2] = sheet.crop(width * 18, height * 4, width, height);
		lady6_up[0] = sheet.crop(width * 16, height * 7, width, height);
		lady6_up[1] = sheet.crop(width * 17, height * 7, width, height);
		lady6_up[2] = sheet.crop(width * 18, height * 7, width, height);
		lady6_left[0] = sheet.crop(width * 16, height * 5, width, height);
		lady6_left[1] = sheet.crop(width * 17, height * 5, width, height);
		lady6_left[2] = sheet.crop(width * 18, height * 5, width, height);
		lady6_right[0] = sheet.crop(width * 16, height * 6, width, height);
		lady6_right[1] = sheet.crop(width * 17, height * 6, width, height);
		lady6_right[2] = sheet.crop(width * 18, height * 6, width, height);
		
		lady7_up = new BufferedImage[3];
		lady7_down = new BufferedImage[3];
		lady7_left = new BufferedImage[3];
		lady7_right = new BufferedImage[3];
		
		lady7_down[0] = sheet.crop(width * 25, height * 4, width, height);
		lady7_down[1] = sheet.crop(width * 26, height * 4, width, height);
		lady7_down[2] = sheet.crop(width * 27, height * 4, width, height);
		lady7_up[0] = sheet.crop(width * 25, height * 7, width, height);
		lady7_up[1] = sheet.crop(width * 26, height * 7, width, height);
		lady7_up[2] = sheet.crop(width * 27, height * 7, width, height);
		lady7_left[0] = sheet.crop(width * 25, height * 5, width, height);
		lady7_left[1] = sheet.crop(width * 26, height * 5, width, height);
		lady7_left[2] = sheet.crop(width * 27, height * 5, width, height);
		lady7_right[0] = sheet.crop(width * 25, height * 6, width, height);
		lady7_right[1] = sheet.crop(width * 26, height * 6, width, height);
		lady7_right[2] = sheet.crop(width * 27, height * 6, width, height);
		
		lady8_up = new BufferedImage[3];
		lady8_down = new BufferedImage[3];
		lady8_left = new BufferedImage[3];
		lady8_right = new BufferedImage[3];
		
		lady8_down[0] = sheet.crop(width * 31, height * 4, width, height);
		lady8_down[1] = sheet.crop(width * 32, height * 4, width, height);
		lady8_down[2] = sheet.crop(width * 33, height * 4, width, height);
		lady8_up[0] = sheet.crop(width * 31, height * 7, width, height);
		lady8_up[1] = sheet.crop(width * 32, height * 7, width, height);
		lady8_up[2] = sheet.crop(width * 33, height * 7, width, height);
		lady8_left[0] = sheet.crop(width * 31, height * 5, width, height);
		lady8_left[1] = sheet.crop(width * 32, height * 5, width, height);
		lady8_left[2] = sheet.crop(width * 33, height * 5, width, height);
		lady8_right[0] = sheet.crop(width * 31, height * 6, width, height);
		lady8_right[1] = sheet.crop(width * 32, height * 6, width, height);
		lady8_right[2] = sheet.crop(width * 33, height * 6, width, height);
		
		man1_up = new BufferedImage[3];
		man1_down = new BufferedImage[3];
		man1_left = new BufferedImage[3];
		man1_right = new BufferedImage[3];
		
		man1_down[0] = sheet.crop(width * 19, 0, width, height);
		man1_down[1] = sheet.crop(width * 20, 0, width, height);
		man1_down[2] = sheet.crop(width * 21, 0, width, height);
		man1_up[0] = sheet.crop(width * 19, height * 3, width, height);
		man1_up[1] = sheet.crop(width * 20, height * 3, width, height);
		man1_up[2] = sheet.crop(width * 21, height * 3, width, height);
		man1_left[0] = sheet.crop(width * 19, height, width, height);
		man1_left[1] = sheet.crop(width * 20, height, width, height);
		man1_left[2] = sheet.crop(width * 21, height, width, height);
		man1_right[0] = sheet.crop(width * 19, height * 2, width, height);
		man1_right[1] = sheet.crop(width * 20, height * 2, width, height);
		man1_right[2] = sheet.crop(width * 21, height * 2, width, height);
		
		man2_up = new BufferedImage[3];
		man2_down = new BufferedImage[3];
		man2_left = new BufferedImage[3];
		man2_right = new BufferedImage[3];
		
		man2_down[0] = sheet.crop(width * 19, height * 4, width, height);
		man2_down[1] = sheet.crop(width * 20, height * 4, width, height);
		man2_down[2] = sheet.crop(width * 21, height * 4, width, height);
		man2_up[0] = sheet.crop(width * 19, height * 7, width, height);
		man2_up[1] = sheet.crop(width * 20, height * 7, width, height);
		man2_up[2] = sheet.crop(width * 21, height * 7, width, height);
		man2_left[0] = sheet.crop(width * 19, height * 5, width, height);
		man2_left[1] = sheet.crop(width * 20, height * 5, width, height);
		man2_left[2] = sheet.crop(width * 21, height * 5, width, height);
		man2_right[0] = sheet.crop(width * 19, height * 6, width, height);
		man2_right[1] = sheet.crop(width * 20, height * 6, width, height);
		man2_right[2] = sheet.crop(width * 21, height * 6, width, height);
		
		man3_up = new BufferedImage[3];
		man3_down = new BufferedImage[3];
		man3_left = new BufferedImage[3];
		man3_right = new BufferedImage[3];
		
		man3_down[0] = sheet.crop(width * 22, 0, width, height);
		man3_down[1] = sheet.crop(width * 23, 0, width, height);
		man3_down[2] = sheet.crop(width * 24, 0, width, height);
		man3_up[0] = sheet.crop(width * 22, height * 3, width, height);
		man3_up[1] = sheet.crop(width * 23, height * 3, width, height);
		man3_up[2] = sheet.crop(width * 24, height * 3, width, height);
		man3_left[0] = sheet.crop(width * 22, height, width, height);
		man3_left[1] = sheet.crop(width * 23, height, width, height);
		man3_left[2] = sheet.crop(width * 24, height, width, height);
		man3_right[0] = sheet.crop(width * 22, height * 2, width, height);
		man3_right[1] = sheet.crop(width * 23, height * 2, width, height);
		man3_right[2] = sheet.crop(width * 24, height * 2, width, height);
		
		man4_up = new BufferedImage[3];
		man4_down = new BufferedImage[3];
		man4_left = new BufferedImage[3];
		man4_right = new BufferedImage[3];
		
		man4_down[0] = sheet.crop(width * 22, height * 4, width, height);
		man4_down[1] = sheet.crop(width * 23, height * 4, width, height);
		man4_down[2] = sheet.crop(width * 24, height * 4, width, height);
		man4_up[0] = sheet.crop(width * 22, height * 7, width, height);
		man4_up[1] = sheet.crop(width * 23, height * 7, width, height);
		man4_up[2] = sheet.crop(width * 24, height * 7, width, height);
		man4_left[0] = sheet.crop(width * 22, height * 5, width, height);
		man4_left[1] = sheet.crop(width * 23, height * 5, width, height);
		man4_left[2] = sheet.crop(width * 24, height * 5, width, height);
		man4_right[0] = sheet.crop(width * 22, height * 6, width, height);
		man4_right[1] = sheet.crop(width * 23, height * 6, width, height);
		man4_right[2] = sheet.crop(width * 24, height * 6, width, height);
		
		man5_up = new BufferedImage[3];
		man5_down = new BufferedImage[3];
		man5_left = new BufferedImage[3];
		man5_right = new BufferedImage[3];
		
		man5_down[0] = sheet.crop(width * 25, 0, width, height);
		man5_down[1] = sheet.crop(width * 26, 0, width, height);
		man5_down[2] = sheet.crop(width * 27, 0, width, height);
		man5_up[0] = sheet.crop(width * 25, height * 3, width, height);
		man5_up[1] = sheet.crop(width * 26, height * 3, width, height);
		man5_up[2] = sheet.crop(width * 27, height * 3, width, height);
		man5_left[0] = sheet.crop(width * 25, height, width, height);
		man5_left[1] = sheet.crop(width * 26, height, width, height);
		man5_left[2] = sheet.crop(width * 27, height, width, height);
		man5_right[0] = sheet.crop(width * 25, height * 2, width, height);
		man5_right[1] = sheet.crop(width * 26, height * 2, width, height);
		man5_right[2] = sheet.crop(width * 27, height * 2, width, height);
		
		man6_up = new BufferedImage[3];
		man6_down = new BufferedImage[3];
		man6_left = new BufferedImage[3];
		man6_right = new BufferedImage[3];
		
		man6_down[0] = sheet.crop(width * 28, 0, width, height);
		man6_down[1] = sheet.crop(width * 29, 0, width, height);
		man6_down[2] = sheet.crop(width * 30, 0, width, height);
		man6_up[0] = sheet.crop(width * 28, height * 3, width, height);
		man6_up[1] = sheet.crop(width * 29, height * 3, width, height);
		man6_up[2] = sheet.crop(width * 30, height * 3, width, height);
		man6_left[0] = sheet.crop(width * 28, height, width, height);
		man6_left[1] = sheet.crop(width * 29, height, width, height);
		man6_left[2] = sheet.crop(width * 30, height, width, height);
		man6_right[0] = sheet.crop(width * 28, height * 2, width, height);
		man6_right[1] = sheet.crop(width * 29, height * 2, width, height);
		man6_right[2] = sheet.crop(width * 30, height * 2, width, height);
		
		man7_up = new BufferedImage[3];
		man7_down = new BufferedImage[3];
		man7_left = new BufferedImage[3];
		man7_right = new BufferedImage[3];
		
		man7_down[0] = sheet.crop(width * 28, height * 4, width, height);
		man7_down[1] = sheet.crop(width * 29, height * 4, width, height);
		man7_down[2] = sheet.crop(width * 30, height * 4, width, height);
		man7_up[0] = sheet.crop(width * 28, height * 7, width, height);
		man7_up[1] = sheet.crop(width * 29, height * 7, width, height);
		man7_up[2] = sheet.crop(width * 30, height * 7, width, height);
		man7_left[0] = sheet.crop(width * 28, height * 5, width, height);
		man7_left[1] = sheet.crop(width * 29, height * 5, width, height);
		man7_left[2] = sheet.crop(width * 30, height * 5, width, height);
		man7_right[0] = sheet.crop(width * 28, height * 6, width, height);
		man7_right[1] = sheet.crop(width * 29, height * 6, width, height);
		man7_right[2] = sheet.crop(width * 30, height * 6, width, height);
		
		man8_up = new BufferedImage[3];
		man8_down = new BufferedImage[3];
		man8_left = new BufferedImage[3];
		man8_right = new BufferedImage[3];
		
		man8_down[0] = sheet.crop(width * 31, 0, width, height);
		man8_down[1] = sheet.crop(width * 32, 0, width, height);
		man8_down[2] = sheet.crop(width * 33, 0, width, height);
		man8_up[0] = sheet.crop(width * 31, height * 3, width, height);
		man8_up[1] = sheet.crop(width * 32, height * 3, width, height);
		man8_up[2] = sheet.crop(width * 33, height * 3, width, height);
		man8_left[0] = sheet.crop(width * 31, height, width, height);
		man8_left[1] = sheet.crop(width * 32, height, width, height);
		man8_left[2] = sheet.crop(width * 33, height, width, height);
		man8_right[0] = sheet.crop(width * 31, height * 2, width, height);
		man8_right[1] = sheet.crop(width * 32, height * 2, width, height);
		man8_right[2] = sheet.crop(width * 33, height * 2, width, height);
		
		child1_up = new BufferedImage[3];
		child1_down = new BufferedImage[3];
		child1_left = new BufferedImage[3];
		child1_right = new BufferedImage[3];
		
		child1_down[0] = sheet.crop(width * 34, 0, width, height);
		child1_down[1] = sheet.crop(width * 35, 0, width, height);
		child1_down[2] = sheet.crop(width * 36, 0, width, height);
		child1_up[0] = sheet.crop(width * 34, height * 3, width, height);
		child1_up[1] = sheet.crop(width * 35, height * 3, width, height);
		child1_up[2] = sheet.crop(width * 36, height * 3, width, height);
		child1_left[0] = sheet.crop(width * 34, height, width, height);
		child1_left[1] = sheet.crop(width * 35, height, width, height);
		child1_left[2] = sheet.crop(width * 36, height, width, height);
		child1_right[0] = sheet.crop(width * 34, height * 2, width, height);
		child1_right[1] = sheet.crop(width * 35, height * 2, width, height);
		child1_right[2] = sheet.crop(width * 36, height * 2, width, height);
		
		child2_up = new BufferedImage[3];
		child2_down = new BufferedImage[3];
		child2_left = new BufferedImage[3];
		child2_right = new BufferedImage[3];
		
		child2_down[0] = sheet.crop(width * 34, height * 4, width, height);
		child2_down[1] = sheet.crop(width * 35, height * 4, width, height);
		child2_down[2] = sheet.crop(width * 36, height * 4, width, height);
		child2_up[0] = sheet.crop(width * 34, height * 7, width, height);
		child2_up[1] = sheet.crop(width * 35, height * 7, width, height);
		child2_up[2] = sheet.crop(width * 36, height * 7, width, height);
		child2_left[0] = sheet.crop(width * 34, height * 5, width, height);
		child2_left[1] = sheet.crop(width * 35, height * 5, width, height);
		child2_left[2] = sheet.crop(width * 36, height * 5, width, height);
		child2_right[0] = sheet.crop(width * 34, height * 6, width, height);
		child2_right[1] = sheet.crop(width * 35, height * 6, width, height);
		child2_right[2] = sheet.crop(width * 36, height * 6, width, height);
		
		child3_up = new BufferedImage[3];
		child3_down = new BufferedImage[3];
		child3_left = new BufferedImage[3];
		child3_right = new BufferedImage[3];
		
		child3_down[0] = sheet.crop(width * 37, 0, width, height);
		child3_down[1] = sheet.crop(width * 38, 0, width, height);
		child3_down[2] = sheet.crop(width * 39, 0, width, height);
		child3_up[0] = sheet.crop(width * 37, height * 3, width, height);
		child3_up[1] = sheet.crop(width * 38, height * 3, width, height);
		child3_up[2] = sheet.crop(width * 39, height * 3, width, height);
		child3_left[0] = sheet.crop(width * 37, height, width, height);
		child3_left[1] = sheet.crop(width * 38, height, width, height);
		child3_left[2] = sheet.crop(width * 39, height, width, height);
		child3_right[0] = sheet.crop(width * 37, height * 2, width, height);
		child3_right[1] = sheet.crop(width * 38, height * 2, width, height);
		child3_right[2] = sheet.crop(width * 39, height * 2, width, height);
		
		child4_up = new BufferedImage[3];
		child4_down = new BufferedImage[3];
		child4_left = new BufferedImage[3];
		child4_right = new BufferedImage[3];
		
		child4_down[0] = sheet.crop(width * 37, height * 4, width, height);
		child4_down[1] = sheet.crop(width * 38, height * 4, width, height);
		child4_down[2] = sheet.crop(width * 39, height * 4, width, height);
		child4_up[0] = sheet.crop(width * 37, height * 7, width, height);
		child4_up[1] = sheet.crop(width * 38, height * 7, width, height);
		child4_up[2] = sheet.crop(width * 39, height * 7, width, height);
		child4_left[0] = sheet.crop(width * 37, height * 5, width, height);
		child4_left[1] = sheet.crop(width * 38, height * 5, width, height);
		child4_left[2] = sheet.crop(width * 39, height * 5, width, height);
		child4_right[0] = sheet.crop(width * 37, height * 6, width, height);
		child4_right[1] = sheet.crop(width * 38, height * 6, width, height);
		child4_right[2] = sheet.crop(width * 39, height * 6, width, height);

		
		//Animals
		dog_up = new BufferedImage[3];
		dog_down = new BufferedImage[3];
		dog_left = new BufferedImage[3];
		dog_right = new BufferedImage[3];
		
		dog_down[0] = sheet.crop(0, height * 16, width, height);
		dog_down[1] = sheet.crop(width, height * 16, width, height);
		dog_down[2] = sheet.crop(width * 2, height * 16, width, height);
		dog_up[0] = sheet.crop(0, height * 19, width, height);
		dog_up[1] = sheet.crop(width, height * 19, width, height);
		dog_up[2] = sheet.crop(width * 2, height * 19, width, height);
		dog_left[0] = sheet.crop(0, height * 17, width, height);
		dog_left[1] = sheet.crop(width, height * 17, width, height);
		dog_left[2] = sheet.crop(width * 2, height * 17, width, height);
		dog_right[0] = sheet.crop(0, height * 18, width, height);
		dog_right[1] = sheet.crop(width, height * 18, width, height);
		dog_right[2] = sheet.crop(width * 2, height * 18, width, height);
		
		cat_up = new BufferedImage[3];
		cat_down = new BufferedImage[3];
		cat_left = new BufferedImage[3];
		cat_right = new BufferedImage[3];
		
		cat_down[0] = sheet.crop(width * 3, height * 16, width, height);
		cat_down[1] = sheet.crop(width * 4, height * 16, width, height);
		cat_down[2] = sheet.crop(width * 5, height * 16, width, height);
		cat_up[0] = sheet.crop(width * 3, height * 19, width, height);
		cat_up[1] = sheet.crop(width * 4, height * 19, width, height);
		cat_up[2] = sheet.crop(width * 5, height * 19, width, height);
		cat_left[0] = sheet.crop(width * 3, height * 17, width, height);
		cat_left[1] = sheet.crop(width * 4, height * 17, width, height);
		cat_left[2] = sheet.crop(width * 5, height * 17, width, height);
		cat_right[0] = sheet.crop(width * 3, height * 18, width, height);
		cat_right[1] = sheet.crop(width * 4, height * 18, width, height);
		cat_right[2] = sheet.crop(width * 5, height * 18, width, height);
		
		cow_up = new BufferedImage[3];
		cow_down = new BufferedImage[3];
		cow_left = new BufferedImage[3];
		cow_right = new BufferedImage[3];
		
		cow_down[0] = sheet.crop(0, height * 20, width, height);
		cow_down[1] = sheet.crop(width, height * 20, width, height);
		cow_down[2] = sheet.crop(width * 2, height * 20, width, height);
		cow_up[0] = sheet.crop(0, height * 23, width, height);
		cow_up[1] = sheet.crop(width, height * 23, width, height);
		cow_up[2] = sheet.crop(width * 2, height * 23, width, height);
		cow_left[0] = sheet.crop(0, height * 21, width, height);
		cow_left[1] = sheet.crop(width, height * 21, width, height);
		cow_left[2] = sheet.crop(width * 2, height * 21, width, height);
		cow_right[0] = sheet.crop(0, height * 22, width, height);
		cow_right[1] = sheet.crop(width, height * 22, width, height);
		cow_right[2] = sheet.crop(width * 2, height * 22, width, height);
		
		horseBrown_up = new BufferedImage[3];
		horseBrown_down = new BufferedImage[3];
		horseBrown_left = new BufferedImage[3];
		horseBrown_right = new BufferedImage[3];
		
		horseBrown_down[0] = sheet.crop(0, height * 24, width, height);
		horseBrown_down[1] = sheet.crop(width, height * 24, width, height);
		horseBrown_down[2] = sheet.crop(width * 2, height * 24, width, height);
		horseBrown_up[0] = sheet.crop(0, height * 27, width, height);
		horseBrown_up[1] = sheet.crop(width, height * 27, width, height);
		horseBrown_up[2] = sheet.crop(width * 2, height * 27, width, height);
		horseBrown_left[0] = sheet.crop(0, height * 25, width, height);
		horseBrown_left[1] = sheet.crop(width, height * 25, width, height);
		horseBrown_left[2] = sheet.crop(width * 2, height * 25, width, height);
		horseBrown_right[0] = sheet.crop(0, height * 26, width, height);
		horseBrown_right[1] = sheet.crop(width, height * 26, width, height);
		horseBrown_right[2] = sheet.crop(width * 2, height * 26, width, height);
		
		horseWhite_up = new BufferedImage[3];
		horseWhite_down = new BufferedImage[3];
		horseWhite_left = new BufferedImage[3];
		horseWhite_right = new BufferedImage[3];
		
		horseWhite_down[0] = sheet.crop(width * 3, height * 24, width, height);
		horseWhite_down[1] = sheet.crop(width * 4, height * 24, width, height);
		horseWhite_down[2] = sheet.crop(width * 5, height * 24, width, height);
		horseWhite_up[0] = sheet.crop(width * 3, height * 27, width, height);
		horseWhite_up[1] = sheet.crop(width * 4, height * 27, width, height);
		horseWhite_up[2] = sheet.crop(width * 5, height * 27, width, height);
		horseWhite_left[0] = sheet.crop(width * 3, height * 25, width, height);
		horseWhite_left[1] = sheet.crop(width * 4, height * 25, width, height);
		horseWhite_left[2] = sheet.crop(width * 5, height * 25, width, height);
		horseWhite_right[0] = sheet.crop(width * 3, height * 26, width, height);
		horseWhite_right[1] = sheet.crop(width * 4, height * 26, width, height);
		horseWhite_right[2] = sheet.crop(width * 5, height * 26, width, height);
		
		sheep_up = new BufferedImage[3];
		sheep_down = new BufferedImage[3];
		sheep_left = new BufferedImage[3];
		sheep_right = new BufferedImage[3];
		
		sheep_down[0] = sheet.crop(0, height * 28, width, height);
		sheep_down[1] = sheet.crop(width, height * 28, width, height);
		sheep_down[2] = sheet.crop(width * 2, height * 28, width, height);
		sheep_up[0] = sheet.crop(0, height * 31, width, height);
		sheep_up[1] = sheet.crop(width, height * 31, width, height);
		sheep_up[2] = sheet.crop(width * 2, height * 31, width, height);
		sheep_left[0] = sheet.crop(0, height * 29, width, height);
		sheep_left[1] = sheet.crop(width, height * 29, width, height);
		sheep_left[2] = sheet.crop(width * 2, height * 29, width, height);
		sheep_right[0] = sheet.crop(0, height * 30, width, height);
		sheep_right[1] = sheet.crop(width, height * 30, width, height);
		sheep_right[2] = sheet.crop(width * 2, height * 30, width, height);
		
		//Souls
		passSoul_up = new BufferedImage[3];
		passSoul_down = new BufferedImage[3];
		passSoul_left = new BufferedImage[3];
		passSoul_right = new BufferedImage[3];
		
		passSoul_down[0] = sheet.crop(width * 7, height * 10, width, height);
		passSoul_down[1] = sheet.crop(width * 8, height * 10, width, height);
		passSoul_down[2] = sheet.crop(width * 9, height * 10, width, height);
		passSoul_up[0] = sheet.crop(width * 7, height * 13, width, height);
		passSoul_up[1] = sheet.crop(width * 8, height * 13, width, height);
		passSoul_up[2] = sheet.crop(width * 9, height * 13, width, height);
		passSoul_left[0] = sheet.crop(width * 7, height * 11, width, height);
		passSoul_left[1] = sheet.crop(width * 8, height * 11, width, height);
		passSoul_left[2] = sheet.crop(width * 9, height * 11, width, height);
		passSoul_right[0] = sheet.crop(width * 7, height * 12, width, height);
		passSoul_right[1] = sheet.crop(width * 8, height * 12, width, height);
		passSoul_right[2] = sheet.crop(width * 9, height * 12, width, height);
		
		runSoul_up = new BufferedImage[3];
		runSoul_down = new BufferedImage[3];
		runSoul_left = new BufferedImage[3];
		runSoul_right = new BufferedImage[3];
		
		runSoul_down[0] = sheet.crop(width * 7, height * 14, width, height);
		runSoul_down[1] = sheet.crop(width * 8, height * 14, width, height);
		runSoul_down[2] = sheet.crop(width * 9, height * 14, width, height);
		runSoul_up[0] = sheet.crop(width * 7, height * 17, width, height);
		runSoul_up[1] = sheet.crop(width * 8, height * 17, width, height);
		runSoul_up[2] = sheet.crop(width * 9, height * 17, width, height);
		runSoul_left[0] = sheet.crop(width * 7, height * 15, width, height);
		runSoul_left[1] = sheet.crop(width * 8, height * 15, width, height);
		runSoul_left[2] = sheet.crop(width * 9, height * 15, width, height);
		runSoul_right[0] = sheet.crop(width * 7, height * 16, width, height);
		runSoul_right[1] = sheet.crop(width * 8, height * 16, width, height);
		runSoul_right[2] = sheet.crop(width * 9, height * 16, width, height);
		
		attackSoul_up = new BufferedImage[3];
		attackSoul_down = new BufferedImage[3];
		attackSoul_left = new BufferedImage[3];
		attackSoul_right = new BufferedImage[3];
		
		attackSoul_down[0] = sheet.crop(width * 7, height * 18, width, height);
		attackSoul_down[1] = sheet.crop(width * 8, height * 18, width, height);
		attackSoul_down[2] = sheet.crop(width * 9, height * 18, width, height);
		attackSoul_up[0] = sheet.crop(width * 7, height * 21, width, height);
		attackSoul_up[1] = sheet.crop(width * 8, height * 21, width, height);
		attackSoul_up[2] = sheet.crop(width * 9, height * 21, width, height);
		attackSoul_left[0] = sheet.crop(width * 7, height * 19, width, height);
		attackSoul_left[1] = sheet.crop(width * 8, height * 19, width, height);
		attackSoul_left[2] = sheet.crop(width * 9, height * 19, width, height);
		attackSoul_right[0] = sheet.crop(width * 7, height * 20, width, height);
		attackSoul_right[1] = sheet.crop(width * 8, height * 20, width, height);
		attackSoul_right[2] = sheet.crop(width * 9, height * 20, width, height);
		
		gorilla_Up = new BufferedImage[3];
		gorilla_Left = new BufferedImage[4];
		gorilla_Right = new BufferedImage[4];
		
		gorilla_Up[0] = sheet.crop(width * 8, height * 29, width, height);
		gorilla_Up[1] = sheet.crop(width * 9, height * 29, width, height);
		gorilla_Up[2] = sheet.crop(width * 10, height * 29, width, height);
				
		gorilla_Left[0] = sheet.crop(width * 7, height * 30, width, height);
		gorilla_Left[1] = sheet.crop(width * 8, height * 30, width, height);
		gorilla_Left[2] = sheet.crop(width * 9, height * 30, width, height);
		gorilla_Left[3] = sheet.crop(width * 10, height * 30, width, height);
				
		gorilla_Right[0] = sheet.crop(width * 7, height * 31, width, height);
		gorilla_Right[1] = sheet.crop(width * 8, height * 31, width, height);
		gorilla_Right[2] = sheet.crop(width * 9, height * 31, width, height);
		gorilla_Right[3] = sheet.crop(width * 10, height * 31, width, height);
				
				
		// Monsters
		// Archers
		spider_down = new BufferedImage[3];
		spider_up = new BufferedImage[3];
		spider_left = new BufferedImage[3];
		spider_right = new BufferedImage[3];
		web = sheet.crop(width * 38, height * 9, width, height);

		spider_down[0] = sheet.crop(width * 37, height * 10, width, height);
		spider_down[1] = sheet.crop(width * 38, height * 10, width, height);
		spider_down[2] = sheet.crop(width * 39, height * 10, width, height);
		spider_up[0] = sheet.crop(width * 37, height * 13, width, height);
		spider_up[1] = sheet.crop(width * 38, height * 13, width, height);
		spider_up[2] = sheet.crop(width * 39, height * 13, width, height);
		spider_left[0] = sheet.crop(width * 37, height * 11, width, height);
		spider_left[1] = sheet.crop(width * 38, height * 11, width, height);
		spider_left[2] = sheet.crop(width * 39, height * 11, width, height);
		spider_right[0] = sheet.crop(width * 37, height * 12, width, height);
		spider_right[1] = sheet.crop(width * 38, height * 12, width, height);
		spider_right[2] = sheet.crop(width * 39, height * 12, width, height);

		dragonA_down = new BufferedImage[3];
		dragonA_up = new BufferedImage[3];
		dragonA_left = new BufferedImage[3];
		dragonA_right = new BufferedImage[3];
		fireBlast = sheet.crop(width * 35, height * 9, width, height);

		dragonA_down[0] = sheet.crop(width * 34, height * 10, width, height);
		dragonA_down[1] = sheet.crop(width * 35, height * 10, width, height);
		dragonA_down[2] = sheet.crop(width * 36, height * 10, width, height);
		dragonA_up[0] = sheet.crop(width * 34, height * 13, width, height);
		dragonA_up[1] = sheet.crop(width * 35, height * 13, width, height);
		dragonA_up[2] = sheet.crop(width * 36, height * 13, width, height);
		dragonA_left[0] = sheet.crop(width * 34, height * 11, width, height);
		dragonA_left[1] = sheet.crop(width * 35, height * 11, width, height);
		dragonA_left[2] = sheet.crop(width * 36, height * 11, width, height);
		dragonA_right[0] = sheet.crop(width * 34, height * 12, width, height);
		dragonA_right[1] = sheet.crop(width * 35, height * 12, width, height);
		dragonA_right[2] = sheet.crop(width * 36, height * 12, width, height);

		sludgeManA_down = new BufferedImage[3];
		sludgeManA_up = new BufferedImage[3];
		sludgeManA_left = new BufferedImage[3];
		sludgeManA_right = new BufferedImage[3];
		sludgeBomb = sheet.crop(width * 29, height * 9, width, height);

		sludgeManA_down[0] = sheet.crop(width * 28, height * 10, width, height);
		sludgeManA_down[1] = sheet.crop(width * 29, height * 10, width, height);
		sludgeManA_down[2] = sheet.crop(width * 30, height * 10, width, height);
		sludgeManA_up[0] = sheet.crop(width * 28, height * 13, width, height);
		sludgeManA_up[1] = sheet.crop(width * 29, height * 13, width, height);
		sludgeManA_up[2] = sheet.crop(width * 30, height * 13, width, height);
		sludgeManA_left[0] = sheet.crop(width * 28, height * 11, width, height);
		sludgeManA_left[1] = sheet.crop(width * 29, height * 11, width, height);
		sludgeManA_left[2] = sheet.crop(width * 30, height * 11, width, height);
		sludgeManA_right[0] = sheet.crop(width * 28, height * 12, width, height);
		sludgeManA_right[1] = sheet.crop(width * 29, height * 12, width, height);
		sludgeManA_right[2] = sheet.crop(width * 30, height * 12, width, height);

		octopus_down = new BufferedImage[3];
		octopus_up = new BufferedImage[3];
		octopus_left = new BufferedImage[3];
		octopus_right = new BufferedImage[3];
		ink = sheet.crop(width * 23, height * 9, width, height);

		octopus_down[0] = sheet.crop(width * 22, height * 10, width, height);
		octopus_down[1] = sheet.crop(width * 23, height * 10, width, height);
		octopus_down[2] = sheet.crop(width * 24, height * 10, width, height);
		octopus_up[0] = sheet.crop(width * 22, height * 13, width, height);
		octopus_up[1] = sheet.crop(width * 23, height * 13, width, height);
		octopus_up[2] = sheet.crop(width * 24, height * 13, width, height);
		octopus_left[0] = sheet.crop(width * 22, height * 11, width, height);
		octopus_left[1] = sheet.crop(width * 23, height * 11, width, height);
		octopus_left[2] = sheet.crop(width * 24, height * 11, width, height);
		octopus_right[0] = sheet.crop(width * 22, height * 12, width, height);
		octopus_right[1] = sheet.crop(width * 23, height * 12, width, height);
		octopus_right[2] = sheet.crop(width * 24, height * 12, width, height);

		skeletonA_down = new BufferedImage[3];
		skeletonA_up = new BufferedImage[3];
		skeletonA_left = new BufferedImage[3];
		skeletonA_right = new BufferedImage[3];
		arrow = sheet.crop(width * 20, height * 9, width, height);

		skeletonA_down[0] = sheet.crop(width * 19, height * 10, width, height);
		skeletonA_down[1] = sheet.crop(width * 20, height * 10, width, height);
		skeletonA_down[2] = sheet.crop(width * 21, height * 10, width, height);
		skeletonA_up[0] = sheet.crop(width * 19, height * 13, width, height);
		skeletonA_up[1] = sheet.crop(width * 20, height * 13, width, height);
		skeletonA_up[2] = sheet.crop(width * 21, height * 13, width, height);
		skeletonA_left[0] = sheet.crop(width * 19, height * 11, width, height);
		skeletonA_left[1] = sheet.crop(width * 20, height * 11, width, height);
		skeletonA_left[2] = sheet.crop(width * 21, height * 11, width, height);
		skeletonA_right[0] = sheet.crop(width * 19, height * 12, width, height);
		skeletonA_right[1] = sheet.crop(width * 20, height * 12, width, height);
		skeletonA_right[2] = sheet.crop(width * 21, height * 12, width, height);

		bee_down = new BufferedImage[3];
		bee_up = new BufferedImage[3];
		bee_left = new BufferedImage[3];
		bee_right = new BufferedImage[3];
		stinger = sheet.crop(width * 17, height * 9, width, height);

		bee_down[0] = sheet.crop(width * 16, height * 10, width, height);
		bee_down[1] = sheet.crop(width * 17, height * 10, width, height);
		bee_down[2] = sheet.crop(width * 18, height * 10, width, height);
		bee_up[0] = sheet.crop(width * 16, height * 13, width, height);
		bee_up[1] = sheet.crop(width * 17, height * 13, width, height);
		bee_up[2] = sheet.crop(width * 18, height * 13, width, height);
		bee_left[0] = sheet.crop(width * 16, height * 11, width, height);
		bee_left[1] = sheet.crop(width * 17, height * 11, width, height);
		bee_left[2] = sheet.crop(width * 18, height * 11, width, height);
		bee_right[0] = sheet.crop(width * 16, height * 12, width, height);
		bee_right[1] = sheet.crop(width * 17, height * 12, width, height);
		bee_right[2] = sheet.crop(width * 18, height * 12, width, height);

		angelA_down = new BufferedImage[3];
		angelA_up = new BufferedImage[3];
		angelA_left = new BufferedImage[3];
		angelA_right = new BufferedImage[3];

		angelA_down[0] = sheet.crop(width * 13, height * 10, width, height);
		angelA_down[1] = sheet.crop(width * 14, height * 10, width, height);
		angelA_down[2] = sheet.crop(width * 15, height * 10, width, height);
		angelA_up[0] = sheet.crop(width * 13, height * 13, width, height);
		angelA_up[1] = sheet.crop(width * 14, height * 13, width, height);
		angelA_up[2] = sheet.crop(width * 15, height * 13, width, height);
		angelA_left[0] = sheet.crop(width * 13, height * 11, width, height);
		angelA_left[1] = sheet.crop(width * 14, height * 11, width, height);
		angelA_left[2] = sheet.crop(width * 15, height * 11, width, height);
		angelA_right[0] = sheet.crop(width * 13, height * 12, width, height);
		angelA_right[1] = sheet.crop(width * 14, height * 12, width, height);
		angelA_right[2] = sheet.crop(width * 15, height * 12, width, height);

		tronA_down = new BufferedImage[3];
		tronA_up = new BufferedImage[3];
		tronA_left = new BufferedImage[3];
		tronA_right = new BufferedImage[3];
		tronDiscE = sheet.crop(width * 11, height * 9, width, height);
		tronDiscP = sheet.crop(width * 12, height * 9, width, height);

		tronA_down[0] = sheet.crop(width * 10, height * 10, width, height);
		tronA_down[1] = sheet.crop(width * 11, height * 10, width, height);
		tronA_down[2] = sheet.crop(width * 12, height * 10, width, height);
		tronA_up[0] = sheet.crop(width * 10, height * 13, width, height);
		tronA_up[1] = sheet.crop(width * 11, height * 13, width, height);
		tronA_up[2] = sheet.crop(width * 12, height * 13, width, height);
		tronA_left[0] = sheet.crop(width * 10, height * 11, width, height);
		tronA_left[1] = sheet.crop(width * 11, height * 11, width, height);
		tronA_left[2] = sheet.crop(width * 12, height * 11, width, height);
		tronA_right[0] = sheet.crop(width * 10, height * 12, width, height);
		tronA_right[1] = sheet.crop(width * 11, height * 12, width, height);
		tronA_right[2] = sheet.crop(width * 12, height * 12, width, height);

		// Flying
		bat_down = new BufferedImage[3];
		bat_up = new BufferedImage[3];
		bat_left = new BufferedImage[3];
		bat_right = new BufferedImage[3];

		bat_down[0] = sheet.crop(width * 37, height * 14, width, height);
		bat_down[1] = sheet.crop(width * 38, height * 14, width, height);
		bat_down[2] = sheet.crop(width * 39, height * 14, width, height);
		bat_up[0] = sheet.crop(width * 37, height * 17, width, height);
		bat_up[1] = sheet.crop(width * 38, height * 17, width, height);
		bat_up[2] = sheet.crop(width * 39, height * 17, width, height);
		bat_left[0] = sheet.crop(width * 37, height * 15, width, height);
		bat_left[1] = sheet.crop(width * 38, height * 15, width, height);
		bat_left[2] = sheet.crop(width * 39, height * 15, width, height);
		bat_right[0] = sheet.crop(width * 37, height * 16, width, height);
		bat_right[1] = sheet.crop(width * 38, height * 16, width, height);
		bat_right[2] = sheet.crop(width * 39, height * 16, width, height);

		batI_down = new BufferedImage[3];
		batI_up = new BufferedImage[3];
		batI_left = new BufferedImage[3];
		batI_right = new BufferedImage[3];

		batI_down[0] = sheet.crop(width * 34, height * 14, width, height);
		batI_down[1] = sheet.crop(width * 35, height * 14, width, height);
		batI_down[2] = sheet.crop(width * 36, height * 14, width, height);
		batI_up[0] = sheet.crop(width * 34, height * 17, width, height);
		batI_up[1] = sheet.crop(width * 35, height * 17, width, height);
		batI_up[2] = sheet.crop(width * 36, height * 17, width, height);
		batI_left[0] = sheet.crop(width * 34, height * 15, width, height);
		batI_left[1] = sheet.crop(width * 35, height * 15, width, height);
		batI_left[2] = sheet.crop(width * 36, height * 15, width, height);
		batI_right[0] = sheet.crop(width * 34, height * 16, width, height);
		batI_right[1] = sheet.crop(width * 35, height * 16, width, height);
		batI_right[2] = sheet.crop(width * 36, height * 16, width, height);

		batF_down = new BufferedImage[3];
		batF_up = new BufferedImage[3];
		batF_left = new BufferedImage[3];
		batF_right = new BufferedImage[3];

		batF_down[0] = sheet.crop(width * 31, height * 14, width, height);
		batF_down[1] = sheet.crop(width * 32, height * 14, width, height);
		batF_down[2] = sheet.crop(width * 33, height * 14, width, height);
		batF_up[0] = sheet.crop(width * 31, height * 17, width, height);
		batF_up[1] = sheet.crop(width * 32, height * 17, width, height);
		batF_up[2] = sheet.crop(width * 33, height * 17, width, height);
		batF_left[0] = sheet.crop(width * 31, height * 15, width, height);
		batF_left[1] = sheet.crop(width * 32, height * 15, width, height);
		batF_left[2] = sheet.crop(width * 33, height * 15, width, height);
		batF_right[0] = sheet.crop(width * 31, height * 16, width, height);
		batF_right[1] = sheet.crop(width * 32, height * 16, width, height);
		batF_right[2] = sheet.crop(width * 33, height * 16, width, height);

		crow_down = new BufferedImage[3];
		crow_up = new BufferedImage[3];
		crow_left = new BufferedImage[3];
		crow_right = new BufferedImage[3];

		crow_down[0] = sheet.crop(width * 28, height * 14, width, height);
		crow_down[1] = sheet.crop(width * 29, height * 14, width, height);
		crow_down[2] = sheet.crop(width * 30, height * 14, width, height);
		crow_up[0] = sheet.crop(width * 28, height * 17, width, height);
		crow_up[1] = sheet.crop(width * 29, height * 17, width, height);
		crow_up[2] = sheet.crop(width * 30, height * 17, width, height);
		crow_left[0] = sheet.crop(width * 28, height * 15, width, height);
		crow_left[1] = sheet.crop(width * 29, height * 15, width, height);
		crow_left[2] = sheet.crop(width * 30, height * 15, width, height);
		crow_right[0] = sheet.crop(width * 28, height * 16, width, height);
		crow_right[1] = sheet.crop(width * 29, height * 16, width, height);
		crow_right[2] = sheet.crop(width * 30, height * 16, width, height);

		flyFish_down = new BufferedImage[3];
		flyFish_up = new BufferedImage[3];
		flyFish_left = new BufferedImage[3];
		flyFish_right = new BufferedImage[3];

		flyFish_down[0] = sheet.crop(width * 22, height * 14, width, height);
		flyFish_down[1] = sheet.crop(width * 23, height * 14, width, height);
		flyFish_down[2] = sheet.crop(width * 24, height * 14, width, height);
		flyFish_up[0] = sheet.crop(width * 22, height * 17, width, height);
		flyFish_up[1] = sheet.crop(width * 23, height * 17, width, height);
		flyFish_up[2] = sheet.crop(width * 24, height * 17, width, height);
		flyFish_left[0] = sheet.crop(width * 22, height * 15, width, height);
		flyFish_left[1] = sheet.crop(width * 23, height * 15, width, height);
		flyFish_left[2] = sheet.crop(width * 24, height * 15, width, height);
		flyFish_right[0] = sheet.crop(width * 22, height * 16, width, height);
		flyFish_right[1] = sheet.crop(width * 23, height * 16, width, height);
		flyFish_right[2] = sheet.crop(width * 24, height * 16, width, height);

		floatHead_down = new BufferedImage[3];
		floatHead_up = new BufferedImage[3];
		floatHead_left = new BufferedImage[3];
		floatHead_right = new BufferedImage[3];

		floatHead_down[0] = sheet.crop(width * 19, height * 14, width, height);
		floatHead_down[1] = sheet.crop(width * 20, height * 14, width, height);
		floatHead_down[2] = sheet.crop(width * 21, height * 14, width, height);
		floatHead_up[0] = sheet.crop(width * 19, height * 17, width, height);
		floatHead_up[1] = sheet.crop(width * 20, height * 17, width, height);
		floatHead_up[2] = sheet.crop(width * 21, height * 17, width, height);
		floatHead_left[0] = sheet.crop(width * 19, height * 15, width, height);
		floatHead_left[1] = sheet.crop(width * 20, height * 15, width, height);
		floatHead_left[2] = sheet.crop(width * 21, height * 15, width, height);
		floatHead_right[0] = sheet.crop(width * 19, height * 16, width, height);
		floatHead_right[1] = sheet.crop(width * 20, height * 16, width, height);
		floatHead_right[2] = sheet.crop(width * 21, height * 16, width, height);

		dove_down = new BufferedImage[3];
		dove_up = new BufferedImage[3];
		dove_left = new BufferedImage[3];
		dove_right = new BufferedImage[3];

		dove_down[0] = sheet.crop(width * 13, height * 14, width, height);
		dove_down[1] = sheet.crop(width * 14, height * 14, width, height);
		dove_down[2] = sheet.crop(width * 15, height * 14, width, height);
		dove_up[0] = sheet.crop(width * 13, height * 17, width, height);
		dove_up[1] = sheet.crop(width * 14, height * 17, width, height);
		dove_up[2] = sheet.crop(width * 15, height * 17, width, height);
		dove_left[0] = sheet.crop(width * 13, height * 15, width, height);
		dove_left[1] = sheet.crop(width * 14, height * 15, width, height);
		dove_left[2] = sheet.crop(width * 15, height * 15, width, height);
		dove_right[0] = sheet.crop(width * 13, height * 16, width, height);
		dove_right[1] = sheet.crop(width * 14, height * 16, width, height);
		dove_right[2] = sheet.crop(width * 15, height * 16, width, height);

		// Normal
		weasel_down = new BufferedImage[3];
		weasel_up = new BufferedImage[3];
		weasel_left = new BufferedImage[3];
		weasel_right = new BufferedImage[3];

		weasel_down[0] = sheet.crop(width * 37, height * 18, width, height);
		weasel_down[1] = sheet.crop(width * 38, height * 18, width, height);
		weasel_down[2] = sheet.crop(width * 39, height * 18, width, height);
		weasel_up[0] = sheet.crop(width * 37, height * 21, width, height);
		weasel_up[1] = sheet.crop(width * 38, height * 21, width, height);
		weasel_up[2] = sheet.crop(width * 39, height * 21, width, height);
		weasel_left[0] = sheet.crop(width * 37, height * 19, width, height);
		weasel_left[1] = sheet.crop(width * 38, height * 19, width, height);
		weasel_left[2] = sheet.crop(width * 39, height * 19, width, height);
		weasel_right[0] = sheet.crop(width * 37, height * 20, width, height);
		weasel_right[1] = sheet.crop(width * 38, height * 20, width, height);
		weasel_right[2] = sheet.crop(width * 39, height * 20, width, height);

		dragonN_down = new BufferedImage[3];
		dragonN_up = new BufferedImage[3];
		dragonN_left = new BufferedImage[3];
		dragonN_right = new BufferedImage[3];

		dragonN_down[0] = sheet.crop(width * 31, height * 18, width, height);
		dragonN_down[1] = sheet.crop(width * 32, height * 18, width, height);
		dragonN_down[2] = sheet.crop(width * 33, height * 18, width, height);
		dragonN_up[0] = sheet.crop(width * 31, height * 21, width, height);
		dragonN_up[1] = sheet.crop(width * 32, height * 21, width, height);
		dragonN_up[2] = sheet.crop(width * 33, height * 21, width, height);
		dragonN_left[0] = sheet.crop(width * 31, height * 19, width, height);
		dragonN_left[1] = sheet.crop(width * 32, height * 19, width, height);
		dragonN_left[2] = sheet.crop(width * 33, height * 19, width, height);
		dragonN_right[0] = sheet.crop(width * 31, height * 20, width, height);
		dragonN_right[1] = sheet.crop(width * 32, height * 20, width, height);
		dragonN_right[2] = sheet.crop(width * 33, height * 20, width, height);

		plantS_down = new BufferedImage[3];
		plantS_up = new BufferedImage[3];
		plantS_left = new BufferedImage[3];
		plantS_right = new BufferedImage[3];

		plantS_down[0] = sheet.crop(width * 28, height * 18, width, height);
		plantS_down[1] = sheet.crop(width * 29, height * 18, width, height);
		plantS_down[2] = sheet.crop(width * 30, height * 18, width, height);
		plantS_up[0] = sheet.crop(width * 28, height * 21, width, height);
		plantS_up[1] = sheet.crop(width * 29, height * 21, width, height);
		plantS_up[2] = sheet.crop(width * 30, height * 21, width, height);
		plantS_left[0] = sheet.crop(width * 28, height * 19, width, height);
		plantS_left[1] = sheet.crop(width * 29, height * 19, width, height);
		plantS_left[2] = sheet.crop(width * 30, height * 19, width, height);
		plantS_right[0] = sheet.crop(width * 28, height * 20, width, height);
		plantS_right[1] = sheet.crop(width * 29, height * 20, width, height);
		plantS_right[2] = sheet.crop(width * 30, height * 20, width, height);

		vampire_down = new BufferedImage[3];
		vampire_up = new BufferedImage[3];
		vampire_left = new BufferedImage[3];
		vampire_right = new BufferedImage[3];

		vampire_down[0] = sheet.crop(width * 25, height * 18, width, height);
		vampire_down[1] = sheet.crop(width * 26, height * 18, width, height);
		vampire_down[2] = sheet.crop(width * 27, height * 18, width, height);
		vampire_up[0] = sheet.crop(width * 25, height * 21, width, height);
		vampire_up[1] = sheet.crop(width * 26, height * 21, width, height);
		vampire_up[2] = sheet.crop(width * 27, height * 21, width, height);
		vampire_left[0] = sheet.crop(width * 25, height * 19, width, height);
		vampire_left[1] = sheet.crop(width * 26, height * 19, width, height);
		vampire_left[2] = sheet.crop(width * 27, height * 19, width, height);
		vampire_right[0] = sheet.crop(width * 25, height * 20, width, height);
		vampire_right[1] = sheet.crop(width * 26, height * 20, width, height);
		vampire_right[2] = sheet.crop(width * 27, height * 20, width, height);

		fishman_down = new BufferedImage[3];
		fishman_up = new BufferedImage[3];
		fishman_left = new BufferedImage[3];
		fishman_right = new BufferedImage[3];

		fishman_down[0] = sheet.crop(width * 22, height * 18, width, height);
		fishman_down[1] = sheet.crop(width * 23, height * 18, width, height);
		fishman_down[2] = sheet.crop(width * 24, height * 18, width, height);
		fishman_up[0] = sheet.crop(width * 22, height * 21, width, height);
		fishman_up[1] = sheet.crop(width * 23, height * 21, width, height);
		fishman_up[2] = sheet.crop(width * 24, height * 21, width, height);
		fishman_left[0] = sheet.crop(width * 22, height * 19, width, height);
		fishman_left[1] = sheet.crop(width * 23, height * 19, width, height);
		fishman_left[2] = sheet.crop(width * 24, height * 19, width, height);
		fishman_right[0] = sheet.crop(width * 22, height * 20, width, height);
		fishman_right[1] = sheet.crop(width * 23, height * 20, width, height);
		fishman_right[2] = sheet.crop(width * 24, height * 20, width, height);

		skeleton_down = new BufferedImage[3];
		skeleton_up = new BufferedImage[3];
		skeleton_left = new BufferedImage[3];
		skeleton_right = new BufferedImage[3];

		skeleton_down[0] = sheet.crop(width * 19, height * 18, width, height);
		skeleton_down[1] = sheet.crop(width * 20, height * 18, width, height);
		skeleton_down[2] = sheet.crop(width * 21, height * 18, width, height);
		skeleton_up[0] = sheet.crop(width * 19, height * 21, width, height);
		skeleton_up[1] = sheet.crop(width * 20, height * 21, width, height);
		skeleton_up[2] = sheet.crop(width * 21, height * 21, width, height);
		skeleton_left[0] = sheet.crop(width * 19, height * 19, width, height);
		skeleton_left[1] = sheet.crop(width * 20, height * 19, width, height);
		skeleton_left[2] = sheet.crop(width * 21, height * 19, width, height);
		skeleton_right[0] = sheet.crop(width * 19, height * 20, width, height);
		skeleton_right[1] = sheet.crop(width * 20, height * 20, width, height);
		skeleton_right[2] = sheet.crop(width * 21, height * 20, width, height);

		plantF_down = new BufferedImage[3];
		plantF_up = new BufferedImage[3];
		plantF_left = new BufferedImage[3];
		plantF_right = new BufferedImage[3];

		plantF_down[0] = sheet.crop(width * 16, height * 18, width, height);
		plantF_down[1] = sheet.crop(width * 17, height * 18, width, height);
		plantF_down[2] = sheet.crop(width * 18, height * 18, width, height);
		plantF_up[0] = sheet.crop(width * 16, height * 21, width, height);
		plantF_up[1] = sheet.crop(width * 17, height * 21, width, height);
		plantF_up[2] = sheet.crop(width * 18, height * 21, width, height);
		plantF_left[0] = sheet.crop(width * 16, height * 19, width, height);
		plantF_left[1] = sheet.crop(width * 17, height * 19, width, height);
		plantF_left[2] = sheet.crop(width * 18, height * 19, width, height);
		plantF_right[0] = sheet.crop(width * 16, height * 20, width, height);
		plantF_right[1] = sheet.crop(width * 17, height * 20, width, height);
		plantF_right[2] = sheet.crop(width * 18, height * 20, width, height);

		cloudRat_down = new BufferedImage[3];
		cloudRat_up = new BufferedImage[3];
		cloudRat_left = new BufferedImage[3];
		cloudRat_right = new BufferedImage[3];

		cloudRat_down[0] = sheet.crop(width * 13, height * 18, width, height);
		cloudRat_down[1] = sheet.crop(width * 14, height * 18, width, height);
		cloudRat_down[2] = sheet.crop(width * 15, height * 18, width, height);
		cloudRat_up[0] = sheet.crop(width * 13, height * 21, width, height);
		cloudRat_up[1] = sheet.crop(width * 14, height * 21, width, height);
		cloudRat_up[2] = sheet.crop(width * 15, height * 21, width, height);
		cloudRat_left[0] = sheet.crop(width * 13, height * 19, width, height);
		cloudRat_left[1] = sheet.crop(width * 14, height * 19, width, height);
		cloudRat_left[2] = sheet.crop(width * 15, height * 19, width, height);
		cloudRat_right[0] = sheet.crop(width * 13, height * 20, width, height);
		cloudRat_right[1] = sheet.crop(width * 14, height * 20, width, height);
		cloudRat_right[2] = sheet.crop(width * 15, height * 20, width, height);

		tronN_down = new BufferedImage[3];
		tronN_up = new BufferedImage[3];
		tronN_left = new BufferedImage[3];
		tronN_right = new BufferedImage[3];

		tronN_down[0] = sheet.crop(width * 10, height * 18, width, height);
		tronN_down[1] = sheet.crop(width * 11, height * 18, width, height);
		tronN_down[2] = sheet.crop(width * 12, height * 18, width, height);
		tronN_up[0] = sheet.crop(width * 10, height * 21, width, height);
		tronN_up[1] = sheet.crop(width * 11, height * 21, width, height);
		tronN_up[2] = sheet.crop(width * 12, height * 21, width, height);
		tronN_left[0] = sheet.crop(width * 10, height * 19, width, height);
		tronN_left[1] = sheet.crop(width * 11, height * 19, width, height);
		tronN_left[2] = sheet.crop(width * 12, height * 19, width, height);
		tronN_right[0] = sheet.crop(width * 10, height * 20, width, height);
		tronN_right[1] = sheet.crop(width * 11, height * 20, width, height);
		tronN_right[2] = sheet.crop(width * 12, height * 20, width, height);

		// Laser
		statueL_down = sheet.crop(width * 38, height * 22, width, height);
		statueL_up = sheet.crop(width * 38, height * 24, width, height);
		statueL_left = sheet.crop(width * 39, height * 23, width, height);
		statueL_right = sheet.crop(width * 37, height * 23, width, height);

		sandLaser = sheet.crop(width * 37, height * 8, width * 2, height);

		orb = sheet.crop(width * 34, height * 22, width, height * 2);
		iceLaser = sheet.crop(width * 34, height * 8, width * 2, height);

		picture_down = sheet.crop(width * 26, height * 22, width, height);
		picture_up = sheet.crop(width * 26, height * 24, width, height);
		picture_left = sheet.crop(width * 27, height * 23, width, height);
		picture_right = sheet.crop(width * 25, height * 23, width, height);

		pictureLaser = sheet.crop(width * 25, height * 8, width * 2, height);

		cannon_down = sheet.crop(width * 23, height * 22, width, height);
		cannon_up = sheet.crop(width * 23, height * 24, width, height);
		cannon_left = sheet.crop(width * 24, height * 23, width, height);
		cannon_right = sheet.crop(width * 22, height * 23, width, height);

		cannonLaser = sheet.crop(width * 22, height * 8, width * 2, height);

		poleHead_down = sheet.crop(width * 20, height * 22, width, height);
		poleHead_up = sheet.crop(width * 20, height * 24, width, height);
		poleHead_left = sheet.crop(width * 21, height * 23, width, height);
		polHead_right = sheet.crop(width * 19, height * 23, width, height);

		dungeonLaser = sheet.crop(width * 19, height * 8, width * 2, height);

		treeL = sheet.crop(width * 17, height * 22, width, height * 3);

		treeLaser = sheet.crop(width * 16, height * 8, width * 2, height);

		rainPiller = sheet.crop(width * 14, height * 22, width, height * 3);

		rainLaser = sheet.crop(width * 13, height * 8, width * 2, height);

		digitalPiller = sheet.crop(width * 11, height * 23, width, height);

		digitalLaser = sheet.crop(width * 11, height * 8, width * 2, height);

		// Trail
		scorpion_down = new BufferedImage[3];
		scorpion_up = new BufferedImage[3];
		scorpion_left = new BufferedImage[3];
		scorpion_right = new BufferedImage[3];
		sandTrail = sheet.crop(width * 37, height * 9, width, height);

		scorpion_down[0] = sheet.crop(width * 37, height * 26, width, height);
		scorpion_down[1] = sheet.crop(width * 38, height * 26, width, height);
		scorpion_down[2] = sheet.crop(width * 39, height * 26, width, height);
		scorpion_up[0] = sheet.crop(width * 37, height * 29, width, height);
		scorpion_up[1] = sheet.crop(width * 38, height * 29, width, height);
		scorpion_up[2] = sheet.crop(width * 39, height * 29, width, height);
		scorpion_left[0] = sheet.crop(width * 37, height * 27, width, height);
		scorpion_left[1] = sheet.crop(width * 38, height * 27, width, height);
		scorpion_left[2] = sheet.crop(width * 39, height * 27, width, height);
		scorpion_right[0] = sheet.crop(width * 37, height * 28, width, height);
		scorpion_right[1] = sheet.crop(width * 38, height * 28, width, height);
		scorpion_right[2] = sheet.crop(width * 39, height * 28, width, height);

		blobI_down = new BufferedImage[3];
		blobI_up = new BufferedImage[3];
		blobI_left = new BufferedImage[3];
		blobI_right = new BufferedImage[3];
		iceTrail = sheet.crop(width * 34, height * 9, width, height);

		blobI_down[0] = sheet.crop(width * 34, height * 26, width, height);
		blobI_down[1] = sheet.crop(width * 35, height * 26, width, height);
		blobI_down[2] = sheet.crop(width * 36, height * 26, width, height);
		blobI_up[0] = sheet.crop(width * 34, height * 29, width, height);
		blobI_up[1] = sheet.crop(width * 35, height * 29, width, height);
		blobI_up[2] = sheet.crop(width * 36, height * 29, width, height);
		blobI_left[0] = sheet.crop(width * 34, height * 27, width, height);
		blobI_left[1] = sheet.crop(width * 35, height * 27, width, height);
		blobI_left[2] = sheet.crop(width * 36, height * 27, width, height);
		blobI_right[0] = sheet.crop(width * 34, height * 28, width, height);
		blobI_right[1] = sheet.crop(width * 35, height * 28, width, height);
		blobI_right[2] = sheet.crop(width * 36, height * 28, width, height);

		blobF_down = new BufferedImage[3];
		blobF_up = new BufferedImage[3];
		blobF_left = new BufferedImage[3];
		blobF_right = new BufferedImage[3];
		fireTrail = sheet.crop(width * 36, height * 9, width, height);

		blobF_down[0] = sheet.crop(width * 31, height * 26, width, height);
		blobF_down[1] = sheet.crop(width * 32, height * 26, width, height);
		blobF_down[2] = sheet.crop(width * 33, height * 26, width, height);
		blobF_up[0] = sheet.crop(width * 31, height * 29, width, height);
		blobF_up[1] = sheet.crop(width * 32, height * 29, width, height);
		blobF_up[2] = sheet.crop(width * 33, height * 29, width, height);
		blobF_left[0] = sheet.crop(width * 31, height * 27, width, height);
		blobF_left[1] = sheet.crop(width * 32, height * 27, width, height);
		blobF_left[2] = sheet.crop(width * 33, height * 27, width, height);
		blobF_right[0] = sheet.crop(width * 31, height * 28, width, height);
		blobF_right[1] = sheet.crop(width * 32, height * 28, width, height);
		blobF_right[2] = sheet.crop(width * 33, height * 28, width, height);

		sludgeManT_down = new BufferedImage[3];
		sludgeManT_up = new BufferedImage[3];
		sludgeManT_left = new BufferedImage[3];
		sludgeManT_right = new BufferedImage[3];
		sludgeTrail = sheet.crop(width * 28, height * 9, width, height);

		sludgeManT_down[0] = sheet.crop(width * 28, height * 26, width, height);
		sludgeManT_down[1] = sheet.crop(width * 29, height * 26, width, height);
		sludgeManT_down[2] = sheet.crop(width * 30, height * 26, width, height);
		sludgeManT_up[0] = sheet.crop(width * 28, height * 29, width, height);
		sludgeManT_up[1] = sheet.crop(width * 29, height * 29, width, height);
		sludgeManT_up[2] = sheet.crop(width * 30, height * 29, width, height);
		sludgeManT_left[0] = sheet.crop(width * 28, height * 27, width, height);
		sludgeManT_left[1] = sheet.crop(width * 29, height * 27, width, height);
		sludgeManT_left[2] = sheet.crop(width * 30, height * 27, width, height);
		sludgeManT_right[0] = sheet.crop(width * 28, height * 28, width, height);
		sludgeManT_right[1] = sheet.crop(width * 29, height * 28, width, height);
		sludgeManT_right[2] = sheet.crop(width * 30, height * 28, width, height);

		ghost_down = new BufferedImage[3];
		ghost_up = new BufferedImage[3];
		ghost_left = new BufferedImage[3];
		ghost_right = new BufferedImage[3];
		ghostTrail = sheet.crop(width * 25, height * 9, width, height);

		ghost_down[0] = sheet.crop(width * 25, height * 26, width, height);
		ghost_down[1] = sheet.crop(width * 26, height * 26, width, height);
		ghost_down[2] = sheet.crop(width * 27, height * 26, width, height);
		ghost_up[0] = sheet.crop(width * 25, height * 29, width, height);
		ghost_up[1] = sheet.crop(width * 26, height * 29, width, height);
		ghost_up[2] = sheet.crop(width * 27, height * 29, width, height);
		ghost_left[0] = sheet.crop(width * 25, height * 27, width, height);
		ghost_left[1] = sheet.crop(width * 26, height * 27, width, height);
		ghost_left[2] = sheet.crop(width * 27, height * 27, width, height);
		ghost_right[0] = sheet.crop(width * 25, height * 28, width, height);
		ghost_right[1] = sheet.crop(width * 26, height * 28, width, height);
		ghost_right[2] = sheet.crop(width * 27, height * 28, width, height);

		blobS_down = new BufferedImage[3];
		blobS_up = new BufferedImage[3];
		blobS_left = new BufferedImage[3];
		blobS_right = new BufferedImage[3];
		swampTrail = sheet.crop(width * 22, height * 9, width, height);

		blobS_down[0] = sheet.crop(width * 22, height * 26, width, height);
		blobS_down[1] = sheet.crop(width * 23, height * 26, width, height);
		blobS_down[2] = sheet.crop(width * 24, height * 26, width, height);
		blobS_up[0] = sheet.crop(width * 22, height * 29, width, height);
		blobS_up[1] = sheet.crop(width * 23, height * 29, width, height);
		blobS_up[2] = sheet.crop(width * 24, height * 29, width, height);
		blobS_left[0] = sheet.crop(width * 22, height * 27, width, height);
		blobS_left[1] = sheet.crop(width * 23, height * 27, width, height);
		blobS_left[2] = sheet.crop(width * 24, height * 27, width, height);
		blobS_right[0] = sheet.crop(width * 22, height * 28, width, height);
		blobS_right[1] = sheet.crop(width * 23, height * 28, width, height);
		blobS_right[2] = sheet.crop(width * 24, height * 28, width, height);

		slug_down = new BufferedImage[3];
		slug_up = new BufferedImage[3];
		slug_left = new BufferedImage[3];
		slug_right = new BufferedImage[3];
		slugTrail = sheet.crop(width * 16, height * 9, width, height);

		slug_down[0] = sheet.crop(width * 16, height * 26, width, height);
		slug_down[1] = sheet.crop(width * 17, height * 26, width, height);
		slug_down[2] = sheet.crop(width * 18, height * 26, width, height);
		slug_up[0] = sheet.crop(width * 16, height * 29, width, height);
		slug_up[1] = sheet.crop(width * 17, height * 29, width, height);
		slug_up[2] = sheet.crop(width * 18, height * 29, width, height);
		slug_left[0] = sheet.crop(width * 16, height * 27, width, height);
		slug_left[1] = sheet.crop(width * 17, height * 27, width, height);
		slug_left[2] = sheet.crop(width * 18, height * 27, width, height);
		slug_right[0] = sheet.crop(width * 16, height * 28, width, height);
		slug_right[1] = sheet.crop(width * 17, height * 28, width, height);
		slug_right[2] = sheet.crop(width * 18, height * 28, width, height);

		cloud_down = new BufferedImage[3];
		cloud_up = new BufferedImage[3];
		cloud_left = new BufferedImage[3];
		cloud_right = new BufferedImage[3];
		cloudTrail = sheet.crop(width * 13, height * 9, width, height);

		cloud_down[0] = sheet.crop(width * 13, height * 26, width, height);
		cloud_down[1] = sheet.crop(width * 14, height * 26, width, height);
		cloud_down[2] = sheet.crop(width * 15, height * 26, width, height);
		cloud_up[0] = sheet.crop(width * 13, height * 29, width, height);
		cloud_up[1] = sheet.crop(width * 14, height * 29, width, height);
		cloud_up[2] = sheet.crop(width * 15, height * 29, width, height);
		cloud_left[0] = sheet.crop(width * 13, height * 27, width, height);
		cloud_left[1] = sheet.crop(width * 14, height * 27, width, height);
		cloud_left[2] = sheet.crop(width * 15, height * 27, width, height);
		cloud_right[0] = sheet.crop(width * 13, height * 28, width, height);
		cloud_right[1] = sheet.crop(width * 14, height * 28, width, height);
		cloud_right[2] = sheet.crop(width * 15, height * 28, width, height);

		tronBike_down = new BufferedImage[2];
		tronBike_up = new BufferedImage[2];
		tronBike_left = new BufferedImage[2];
		tronBike_right = new BufferedImage[2];
		tronBikeTrail = sheet.crop(width * 10, height * 9, width, height);

		tronBike_down[0] = sheet.crop(width * 11, height * 26, width, height);
		tronBike_down[1] = sheet.crop(width * 12, height * 26, width, height);
		tronBike_up[0] = sheet.crop(width * 11, height * 29, width, height);
		tronBike_up[1] = sheet.crop(width * 12, height * 29, width, height);
		tronBike_left[0] = sheet.crop(width * 11, height * 27, width, height);
		tronBike_left[1] = sheet.crop(width * 12, height * 27, width, height);
		tronBike_right[0] = sheet.crop(width * 11, height * 28, width, height);
		tronBike_right[1] = sheet.crop(width * 12, height * 28, width, height);

		// Leash
		rat_down = new BufferedImage[3];
		rat_up = new BufferedImage[3];
		rat_left = new BufferedImage[3];
		rat_right = new BufferedImage[3];

		rat_down[0] = sheet.crop(width * 37, height * 30, width, height);
		rat_down[1] = sheet.crop(width * 38, height * 30, width, height);
		rat_down[2] = sheet.crop(width * 39, height * 30, width, height);
		rat_up[0] = sheet.crop(width * 37, height * 33, width, height);
		rat_up[1] = sheet.crop(width * 38, height * 33, width, height);
		rat_up[2] = sheet.crop(width * 39, height * 33, width, height);
		rat_left[0] = sheet.crop(width * 37, height * 31, width, height);
		rat_left[1] = sheet.crop(width * 38, height * 31, width, height);
		rat_left[2] = sheet.crop(width * 39, height * 31, width, height);
		rat_right[0] = sheet.crop(width * 37, height * 32, width, height);
		rat_right[1] = sheet.crop(width * 38, height * 32, width, height);
		rat_right[2] = sheet.crop(width * 39, height * 32, width, height);

		frog_down = new BufferedImage[3];
		frog_up = new BufferedImage[3];
		frog_left = new BufferedImage[3];
		frog_right = new BufferedImage[3];

		frog_down[0] = sheet.crop(width * 28, height * 30, width, height);
		frog_down[1] = sheet.crop(width * 29, height * 30, width, height);
		frog_down[2] = sheet.crop(width * 30, height * 30, width, height);
		frog_up[0] = sheet.crop(width * 28, height * 33, width, height);
		frog_up[1] = sheet.crop(width * 29, height * 33, width, height);
		frog_up[2] = sheet.crop(width * 30, height * 33, width, height);
		frog_left[0] = sheet.crop(width * 28, height * 31, width, height);
		frog_left[1] = sheet.crop(width * 29, height * 31, width, height);
		frog_left[2] = sheet.crop(width * 30, height * 31, width, height);
		frog_right[0] = sheet.crop(width * 28, height * 32, width, height);
		frog_right[1] = sheet.crop(width * 29, height * 32, width, height);
		frog_right[2] = sheet.crop(width * 30, height * 32, width, height);

		wolf_down = new BufferedImage[3];
		wolf_up = new BufferedImage[3];
		wolf_left = new BufferedImage[3];
		wolf_right = new BufferedImage[3];

		wolf_down[0] = sheet.crop(width * 19, height * 30, width, height);
		wolf_down[1] = sheet.crop(width * 20, height * 30, width, height);
		wolf_down[2] = sheet.crop(width * 21, height * 30, width, height);
		wolf_up[0] = sheet.crop(width * 19, height * 33, width, height);
		wolf_up[1] = sheet.crop(width * 20, height * 33, width, height);
		wolf_up[2] = sheet.crop(width * 21, height * 33, width, height);
		wolf_left[0] = sheet.crop(width * 19, height * 31, width, height);
		wolf_left[1] = sheet.crop(width * 20, height * 31, width, height);
		wolf_left[2] = sheet.crop(width * 21, height * 31, width, height);
		wolf_right[0] = sheet.crop(width * 19, height * 32, width, height);
		wolf_right[1] = sheet.crop(width * 20, height * 32, width, height);
		wolf_right[2] = sheet.crop(width * 21, height * 32, width, height);

		snake_down = new BufferedImage[3];
		snake_up = new BufferedImage[3];
		snake_left = new BufferedImage[3];
		snake_right = new BufferedImage[3];

		snake_down[0] = sheet.crop(width * 22, height * 30, width, height);
		snake_down[1] = sheet.crop(width * 23, height * 30, width, height);
		snake_down[2] = sheet.crop(width * 24, height * 30, width, height);
		snake_up[0] = sheet.crop(width * 22, height * 33, width, height);
		snake_up[1] = sheet.crop(width * 23, height * 33, width, height);
		snake_up[2] = sheet.crop(width * 24, height * 33, width, height);
		snake_left[0] = sheet.crop(width * 22, height * 31, width, height);
		snake_left[1] = sheet.crop(width * 23, height * 31, width, height);
		snake_left[2] = sheet.crop(width * 24, height * 31, width, height);
		snake_right[0] = sheet.crop(width * 22, height * 32, width, height);
		snake_right[1] = sheet.crop(width * 23, height * 32, width, height);
		snake_right[2] = sheet.crop(width * 24, height * 32, width, height);

		ghostDog_down = new BufferedImage[3];
		ghostDog_up = new BufferedImage[3];
		ghostDog_left = new BufferedImage[3];
		ghostDog_right = new BufferedImage[3];

		ghostDog_down[0] = sheet.crop(width * 25, height * 30, width, height);
		ghostDog_down[1] = sheet.crop(width * 26, height * 30, width, height);
		ghostDog_down[2] = sheet.crop(width * 27, height * 30, width, height);
		ghostDog_up[0] = sheet.crop(width * 25, height * 33, width, height);
		ghostDog_up[1] = sheet.crop(width * 26, height * 33, width, height);
		ghostDog_up[2] = sheet.crop(width * 27, height * 33, width, height);
		ghostDog_left[0] = sheet.crop(width * 25, height * 31, width, height);
		ghostDog_left[1] = sheet.crop(width * 26, height * 31, width, height);
		ghostDog_left[2] = sheet.crop(width * 27, height * 31, width, height);
		ghostDog_right[0] = sheet.crop(width * 25, height * 32, width, height);
		ghostDog_right[1] = sheet.crop(width * 26, height * 32, width, height);
		ghostDog_right[2] = sheet.crop(width * 27, height * 32, width, height);

		plantDog_down = new BufferedImage[3];
		plantDog_up = new BufferedImage[3];
		plantDog_left = new BufferedImage[3];
		plantDog_right = new BufferedImage[3];

		plantDog_down[0] = sheet.crop(width * 16, height * 30, width, height);
		plantDog_down[1] = sheet.crop(width * 17, height * 30, width, height);
		plantDog_down[2] = sheet.crop(width * 18, height * 30, width, height);
		plantDog_up[0] = sheet.crop(width * 16, height * 33, width, height);
		plantDog_up[1] = sheet.crop(width * 17, height * 33, width, height);
		plantDog_up[2] = sheet.crop(width * 16, height * 33, width, height);
		plantDog_left[0] = sheet.crop(width * 16, height * 31, width, height);
		plantDog_left[1] = sheet.crop(width * 17, height * 31, width, height);
		plantDog_left[2] = sheet.crop(width * 18, height * 31, width, height);
		plantDog_right[0] = sheet.crop(width * 16, height * 32, width, height);
		plantDog_right[1] = sheet.crop(width * 17, height * 32, width, height);
		plantDog_right[2] = sheet.crop(width * 18, height * 32, width, height);

		cloudDog_down = new BufferedImage[3];
		cloudDog_up = new BufferedImage[3];
		cloudDog_left = new BufferedImage[3];
		cloudDog_right = new BufferedImage[3];

		cloudDog_down[0] = sheet.crop(width * 13, height * 30, width, height);
		cloudDog_down[1] = sheet.crop(width * 14, height * 30, width, height);
		cloudDog_down[2] = sheet.crop(width * 15, height * 30, width, height);
		cloudDog_up[0] = sheet.crop(width * 13, height * 33, width, height);
		cloudDog_up[1] = sheet.crop(width * 14, height * 33, width, height);
		cloudDog_up[2] = sheet.crop(width * 15, height * 33, width, height);
		cloudDog_left[0] = sheet.crop(width * 13, height * 31, width, height);
		cloudDog_left[1] = sheet.crop(width * 14, height * 31, width, height);
		cloudDog_left[2] = sheet.crop(width * 15, height * 31, width, height);
		cloudDog_right[0] = sheet.crop(width * 13, height * 32, width, height);
		cloudDog_right[1] = sheet.crop(width * 14, height * 32, width, height);
		cloudDog_right[2] = sheet.crop(width * 15, height * 32, width, height);

		// Armor
		iceManA_down = new BufferedImage[3];
		iceManA_up = new BufferedImage[3];
		iceManA_left = new BufferedImage[3];
		iceManA_right = new BufferedImage[3];

		iceManA_down[0] = sheet.crop(width * 34, height * 34, width, height);
		iceManA_down[1] = sheet.crop(width * 35, height * 34, width, height);
		iceManA_down[2] = sheet.crop(width * 36, height * 34, width, height);
		iceManA_up[0] = sheet.crop(width * 34, height * 37, width, height);
		iceManA_up[1] = sheet.crop(width * 35, height * 37, width, height);
		iceManA_up[2] = sheet.crop(width * 36, height * 37, width, height);
		iceManA_left[0] = sheet.crop(width * 34, height * 35, width, height);
		iceManA_left[1] = sheet.crop(width * 35, height * 35, width, height);
		iceManA_left[2] = sheet.crop(width * 36, height * 35, width, height);
		iceManA_right[0] = sheet.crop(width * 34, height * 36, width, height);
		iceManA_right[1] = sheet.crop(width * 35, height * 36, width, height);
		iceManA_right[2] = sheet.crop(width * 36, height * 36, width, height);

		stoneSludge_down = new BufferedImage[3];
		stoneSludge_up = new BufferedImage[3];
		stoneSludge_left = new BufferedImage[3];
		stoneSludge_right = new BufferedImage[3];

		stoneSludge_down[0] = sheet.crop(width * 28, height * 34, width, height);
		stoneSludge_down[1] = sheet.crop(width * 29, height * 34, width, height);
		stoneSludge_down[2] = sheet.crop(width * 30, height * 34, width, height);
		stoneSludge_up[0] = sheet.crop(width * 28, height * 37, width, height);
		stoneSludge_up[1] = sheet.crop(width * 29, height * 37, width, height);
		stoneSludge_up[2] = sheet.crop(width * 30, height * 37, width, height);
		stoneSludge_left[0] = sheet.crop(width * 28, height * 35, width, height);
		stoneSludge_left[1] = sheet.crop(width * 29, height * 35, width, height);
		stoneSludge_left[2] = sheet.crop(width * 30, height * 35, width, height);
		stoneSludge_right[0] = sheet.crop(width * 28, height * 36, width, height);
		stoneSludge_right[1] = sheet.crop(width * 29, height * 36, width, height);
		stoneSludge_right[2] = sheet.crop(width * 30, height * 36, width, height);

		knight_down = new BufferedImage[3];
		knight_up = new BufferedImage[3];
		knight_left = new BufferedImage[3];
		knight_right = new BufferedImage[3];

		knight_down[0] = sheet.crop(width * 25, height * 34, width, height);
		knight_down[1] = sheet.crop(width * 26, height * 34, width, height);
		knight_down[2] = sheet.crop(width * 27, height * 34, width, height);
		knight_up[0] = sheet.crop(width * 25, height * 37, width, height);
		knight_up[1] = sheet.crop(width * 26, height * 37, width, height);
		knight_up[2] = sheet.crop(width * 27, height * 37, width, height);
		knight_left[0] = sheet.crop(width * 25, height * 35, width, height);
		knight_left[1] = sheet.crop(width * 26, height * 35, width, height);
		knight_left[2] = sheet.crop(width * 27, height * 35, width, height);
		knight_right[0] = sheet.crop(width * 25, height * 36, width, height);
		knight_right[1] = sheet.crop(width * 26, height * 36, width, height);
		knight_right[2] = sheet.crop(width * 27, height * 36, width, height);

		knightSkel_down = new BufferedImage[3];
		knightSkel_up = new BufferedImage[3];
		knightSkel_left = new BufferedImage[3];
		knightSkel_right = new BufferedImage[3];

		knightSkel_down[0] = sheet.crop(width * 19, height * 34, width, height);
		knightSkel_down[1] = sheet.crop(width * 20, height * 34, width, height);
		knightSkel_down[2] = sheet.crop(width * 21, height * 34, width, height);
		knightSkel_up[0] = sheet.crop(width * 19, height * 37, width, height);
		knightSkel_up[1] = sheet.crop(width * 20, height * 37, width, height);
		knightSkel_up[2] = sheet.crop(width * 21, height * 37, width, height);
		knightSkel_left[0] = sheet.crop(width * 19, height * 35, width, height);
		knightSkel_left[1] = sheet.crop(width * 20, height * 35, width, height);
		knightSkel_left[2] = sheet.crop(width * 21, height * 35, width, height);
		knightSkel_right[0] = sheet.crop(width * 19, height * 36, width, height);
		knightSkel_right[1] = sheet.crop(width * 20, height * 36, width, height);
		knightSkel_right[2] = sheet.crop(width * 21, height * 36, width, height);

		ent_down = new BufferedImage[3];
		ent_up = new BufferedImage[3];
		ent_left = new BufferedImage[3];
		ent_right = new BufferedImage[3];

		ent_down[0] = sheet.crop(width * 16, height * 34, width, height);
		ent_down[1] = sheet.crop(width * 17, height * 34, width, height);
		ent_down[2] = sheet.crop(width * 18, height * 34, width, height);
		ent_up[0] = sheet.crop(width * 16, height * 37, width, height);
		ent_up[1] = sheet.crop(width * 17, height * 37, width, height);
		ent_up[2] = sheet.crop(width * 18, height * 37, width, height);
		ent_left[0] = sheet.crop(width * 16, height * 35, width, height);
		ent_left[1] = sheet.crop(width * 17, height * 35, width, height);
		ent_left[2] = sheet.crop(width * 18, height * 35, width, height);
		ent_right[0] = sheet.crop(width * 16, height * 36, width, height);
		ent_right[1] = sheet.crop(width * 17, height * 36, width, height);
		ent_right[2] = sheet.crop(width * 18, height * 36, width, height);

		tron_down = new BufferedImage[3];
		tron_up = new BufferedImage[3];
		tron_left = new BufferedImage[3];
		tron_right = new BufferedImage[3];

		tron_down[0] = sheet.crop(width * 10, height * 34, width, height);
		tron_down[1] = sheet.crop(width * 11, height * 34, width, height);
		tron_down[2] = sheet.crop(width * 12, height * 34, width, height);
		tron_up[0] = sheet.crop(width * 10, height * 37, width, height);
		tron_up[1] = sheet.crop(width * 11, height * 37, width, height);
		tron_up[2] = sheet.crop(width * 12, height * 37, width, height);
		tron_left[0] = sheet.crop(width * 10, height * 35, width, height);
		tron_left[1] = sheet.crop(width * 11, height * 35, width, height);
		tron_left[2] = sheet.crop(width * 12, height * 35, width, height);
		tron_right[0] = sheet.crop(width * 10, height * 36, width, height);
		tron_right[1] = sheet.crop(width * 11, height * 36, width, height);
		tron_right[2] = sheet.crop(width * 12, height * 36, width, height);

		// Mirror
		sandStatue_down = new BufferedImage[3];
		sandStatue_up = new BufferedImage[3];
		sandStatue_left = new BufferedImage[3];
		sandStatue_right = new BufferedImage[3];

		sandStatue_down[0] = sheet.crop(width * 37, height * 38, width, height);
		sandStatue_down[1] = sheet.crop(width * 38, height * 38, width, height);
		sandStatue_down[2] = sheet.crop(width * 39, height * 38, width, height);
		sandStatue_up[0] = sheet.crop(width * 37, height * 41, width, height);
		sandStatue_up[1] = sheet.crop(width * 38, height * 41, width, height);
		sandStatue_up[2] = sheet.crop(width * 39, height * 41, width, height);
		sandStatue_left[0] = sheet.crop(width * 37, height * 39, width, height);
		sandStatue_left[1] = sheet.crop(width * 38, height * 39, width, height);
		sandStatue_left[2] = sheet.crop(width * 39, height * 39, width, height);
		sandStatue_right[0] = sheet.crop(width * 37, height * 40, width, height);
		sandStatue_right[1] = sheet.crop(width * 38, height * 40, width, height);
		sandStatue_right[2] = sheet.crop(width * 39, height * 40, width, height);

		iceManM_down = new BufferedImage[3];
		iceManM_up = new BufferedImage[3];
		iceManM_left = new BufferedImage[3];
		iceManM_right = new BufferedImage[3];

		iceManM_down[0] = sheet.crop(width * 34, height * 38, width, height);
		iceManM_down[1] = sheet.crop(width * 35, height * 38, width, height);
		iceManM_down[2] = sheet.crop(width * 36, height * 38, width, height);
		iceManM_up[0] = sheet.crop(width * 34, height * 41, width, height);
		iceManM_up[1] = sheet.crop(width * 35, height * 41, width, height);
		iceManM_up[2] = sheet.crop(width * 36, height * 41, width, height);
		iceManM_left[0] = sheet.crop(width * 34, height * 39, width, height);
		iceManM_left[1] = sheet.crop(width * 35, height * 39, width, height);
		iceManM_left[2] = sheet.crop(width * 36, height * 39, width, height);
		iceManM_right[0] = sheet.crop(width * 34, height * 40, width, height);
		iceManM_right[1] = sheet.crop(width * 35, height * 40, width, height);
		iceManM_right[2] = sheet.crop(width * 36, height * 40, width, height);

		sludgeMirror_down = new BufferedImage[3];
		sludgeMirror_up = new BufferedImage[3];
		sludgeMirror_left = new BufferedImage[3];
		sludgeMirror_right = new BufferedImage[3];

		sludgeMirror_down[0] = sheet.crop(width * 28, height * 38, width, height);
		sludgeMirror_down[1] = sheet.crop(width * 29, height * 38, width, height);
		sludgeMirror_down[2] = sheet.crop(width * 30, height * 38, width, height);
		sludgeMirror_up[0] = sheet.crop(width * 28, height * 41, width, height);
		sludgeMirror_up[1] = sheet.crop(width * 29, height * 41, width, height);
		sludgeMirror_up[2] = sheet.crop(width * 30, height * 41, width, height);
		sludgeMirror_left[0] = sheet.crop(width * 28, height * 39, width, height);
		sludgeMirror_left[1] = sheet.crop(width * 29, height * 39, width, height);
		sludgeMirror_left[2] = sheet.crop(width * 30, height * 39, width, height);
		sludgeMirror_right[0] = sheet.crop(width * 28, height * 40, width, height);
		sludgeMirror_right[1] = sheet.crop(width * 29, height * 40, width, height);
		sludgeMirror_right[2] = sheet.crop(width * 30, height * 40, width, height);

		knightStatue_down = new BufferedImage[2];
		knightStatue_up = new BufferedImage[2];
		knightStatue_left = new BufferedImage[2];
		knightStatue_right = new BufferedImage[2];

		knightStatue_down[0] = sheet.crop(width * 26, height * 38, width, height);
		knightStatue_down[1] = sheet.crop(width * 27, height * 38, width, height);
		knightStatue_up[0] = sheet.crop(width * 26, height * 41, width, height);
		knightStatue_up[1] = sheet.crop(width * 27, height * 41, width, height);
		knightStatue_left[0] = sheet.crop(width * 26, height * 39, width, height);
		knightStatue_left[1] = sheet.crop(width * 27, height * 39, width, height);
		knightStatue_right[0] = sheet.crop(width * 26, height * 40, width, height);
		knightStatue_right[1] = sheet.crop(width * 27, height * 40, width, height);

		woodStatue_down = new BufferedImage[2];
		woodStatue_up = new BufferedImage[2];
		woodStatue_left = new BufferedImage[2];
		woodStatue_right = new BufferedImage[2];

		woodStatue_down[0] = sheet.crop(width * 23, height * 38, width, height);
		woodStatue_down[1] = sheet.crop(width * 24, height * 38, width, height);
		woodStatue_up[0] = sheet.crop(width * 23, height * 41, width, height);
		woodStatue_up[1] = sheet.crop(width * 24, height * 41, width, height);
		woodStatue_left[0] = sheet.crop(width * 23, height * 39, width, height);
		woodStatue_left[1] = sheet.crop(width * 24, height * 39, width, height);
		woodStatue_right[0] = sheet.crop(width * 23, height * 40, width, height);
		woodStatue_right[1] = sheet.crop(width * 24, height * 40, width, height);

		skelStatue_down = new BufferedImage[3];
		skelStatue_up = new BufferedImage[3];
		skelStatue_left = new BufferedImage[3];
		skelStatue_right = new BufferedImage[3];

		skelStatue_down[0] = sheet.crop(width * 19, height * 38, width, height);
		skelStatue_down[1] = sheet.crop(width * 20, height * 38, width, height);
		skelStatue_down[2] = sheet.crop(width * 21, height * 38, width, height);
		skelStatue_up[0] = sheet.crop(width * 19, height * 41, width, height);
		skelStatue_up[1] = sheet.crop(width * 20, height * 41, width, height);
		skelStatue_up[2] = sheet.crop(width * 21, height * 41, width, height);
		skelStatue_left[0] = sheet.crop(width * 19, height * 39, width, height);
		skelStatue_left[1] = sheet.crop(width * 20, height * 39, width, height);
		skelStatue_left[2] = sheet.crop(width * 21, height * 39, width, height);
		skelStatue_right[0] = sheet.crop(width * 19, height * 40, width, height);
		skelStatue_right[1] = sheet.crop(width * 20, height * 40, width, height);
		skelStatue_right[2] = sheet.crop(width * 21, height * 40, width, height);

		vineMan_down = new BufferedImage[3];
		vineMan_up = new BufferedImage[3];
		vineMan_left = new BufferedImage[3];
		vineMan_right = new BufferedImage[3];

		vineMan_down[0] = sheet.crop(width * 16, height * 38, width, height);
		vineMan_down[1] = sheet.crop(width * 17, height * 38, width, height);
		vineMan_down[2] = sheet.crop(width * 18, height * 38, width, height);
		vineMan_up[0] = sheet.crop(width * 16, height * 41, width, height);
		vineMan_up[1] = sheet.crop(width * 17, height * 41, width, height);
		vineMan_up[2] = sheet.crop(width * 18, height * 41, width, height);
		vineMan_left[0] = sheet.crop(width * 16, height * 39, width, height);
		vineMan_left[1] = sheet.crop(width * 17, height * 39, width, height);
		vineMan_left[2] = sheet.crop(width * 18, height * 39, width, height);
		vineMan_right[0] = sheet.crop(width * 16, height * 40, width, height);
		vineMan_right[1] = sheet.crop(width * 17, height * 40, width, height);
		vineMan_right[2] = sheet.crop(width * 18, height * 40, width, height);

		angelStatue_down = new BufferedImage[3];
		angelStatue_up = new BufferedImage[3];
		angelStatue_left = new BufferedImage[3];
		angelStatue_right = new BufferedImage[3];

		angelStatue_down[0] = sheet.crop(width * 13, height * 38, width, height);
		angelStatue_down[1] = sheet.crop(width * 14, height * 38, width, height);
		angelStatue_down[2] = sheet.crop(width * 15, height * 38, width, height);
		angelStatue_up[0] = sheet.crop(width * 13, height * 41, width, height);
		angelStatue_up[1] = sheet.crop(width * 14, height * 41, width, height);
		angelStatue_up[2] = sheet.crop(width * 15, height * 41, width, height);
		angelStatue_left[0] = sheet.crop(width * 13, height * 39, width, height);
		angelStatue_left[1] = sheet.crop(width * 14, height * 39, width, height);
		angelStatue_left[2] = sheet.crop(width * 15, height * 39, width, height);
		angelStatue_right[0] = sheet.crop(width * 13, height * 40, width, height);
		angelStatue_right[1] = sheet.crop(width * 14, height * 40, width, height);
		angelStatue_right[2] = sheet.crop(width * 15, height * 40, width, height);

		tronM_down = new BufferedImage[3];
		tronM_up = new BufferedImage[3];
		tronM_left = new BufferedImage[3];
		tronM_right = new BufferedImage[3];

		tronM_down[0] = sheet.crop(width * 10, height * 38, width, height);
		tronM_down[1] = sheet.crop(width * 11, height * 38, width, height);
		tronM_down[2] = sheet.crop(width * 12, height * 38, width, height);
		tronM_up[0] = sheet.crop(width * 10, height * 41, width, height);
		tronM_up[1] = sheet.crop(width * 11, height * 41, width, height);
		tronM_up[2] = sheet.crop(width * 12, height * 41, width, height);
		tronM_left[0] = sheet.crop(width * 10, height * 39, width, height);
		tronM_left[1] = sheet.crop(width * 11, height * 39, width, height);
		tronM_left[2] = sheet.crop(width * 12, height * 39, width, height);
		tronM_right[0] = sheet.crop(width * 10, height * 40, width, height);
		tronM_right[1] = sheet.crop(width * 11, height * 40, width, height);
		tronM_right[2] = sheet.crop(width * 12, height * 40, width, height);

		SpriteSheet sTiles = new SpriteSheet(ImageLoader.loadImage("/textures/SoulTiles.png"));
		// Items
		heartFull = sheet.crop(width * 8, height * 3, (width / 2), height / 2);
		heartEmpty = sheet.crop(width * 8, (height * 3) + 16, width / 2, height / 2);

		key = sheet.crop((width * 7) + 16, height * 3, width / 2, height);
		bossKey = sheet.crop(width * 7, height * 3, width / 2, height);

		chestOpen = sheet.crop(width * 10, height * 3, width, height);
		chestClosed = sheet.crop(width * 9, height * 3, width, height);
		potion = sheet.crop(width * 11, height * 3, width, height);
		selectionBox = sheet.crop(width * 12, height * 3, width, height);
		
		switchOpen = sTiles.crop(width * 24, height * 19, width, height);
		switchClosed = sTiles.crop(width * 23, height * 19, width, height);
		
		bombExplosion = new BufferedImage[2];
		
		bombExplosion[0] = sheet.crop(width * 5, height * 4, width, height);
		bombExplosion[1] = sheet.crop(width * 6, height * 4, width, height);
		
		bomb = sheet.crop(width * 6, height * 4, width, height);
		heavenEntrance = sTiles.crop(width * 8, height * 10, width * 3, height * 2);
		
		explosion = new BufferedImage[6];
		
		explosion[0] = sTiles.crop(width * 33, height * 23, width, height * 3);
		explosion[1] = sTiles.crop(width * 34, height * 23, width, height * 3);
		explosion[2] = sTiles.crop(width * 35, height * 23, width, height * 3);
		explosion[3] = sTiles.crop(width * 36, height * 23, width, height * 3);
		explosion[4] = sTiles.crop(width * 37, height * 23, width, height * 3);
		explosion[5] = sTiles.crop(width * 38, height * 23, width, height * 3);
		
		buttonB = sheet.crop(width * 5, height * 6, width, height);
		buttonA = sheet.crop(width * 6, height * 6, width, height);
		buttonUp = sheet.crop(width * 5, height * 7, width, height);
		buttonDown = sheet.crop(width * 6, height * 8, width, height);
		buttonLeft = sheet.crop(width * 5, height * 8, width, height);
		buttonRight = sheet.crop(width * 6, height * 7, width, height);
		
		coin1 = sheet.crop(width * 7, height * 8, width, height);
		coin2 = sheet.crop(width * 8, height * 8, width, height);
		coin5 = sheet.crop(width * 9, height * 8, width, height);
		coin10 = sheet.crop(width * 10, height * 8, width, height);
		
		slot = sTiles.crop(width * 3, 0, width, height);
		
		riddleWood = sTiles.crop(width * 34, height * 20, width * 2, height);
		riddleStone = sTiles.crop(width * 34, height * 19, width * 2, height);
		
		crackClosed = sTiles.crop(width * 26, height * 11, width, height);
		crackOpened = sTiles.crop(width * 27, height * 11, width, height);

		// Tiles
		grass = sTiles.crop(width * 20, height * 3, width, height);
		dirt = sTiles.crop(width * 21, height * 5, width, height);
		flower = sTiles.crop(width * 21, height * 3, width, height);
		grassToDirtTL = sTiles.crop(width * 20, height * 4, width, height);
		grassToDirtTM = sTiles.crop(width * 21, height * 4, width, height);
		grassToDirtTR = sTiles.crop(width * 22, height * 4, width, height);
		grassToDirtML = sTiles.crop(width * 20, height * 5, width, height);
		grassToDirtMR = sTiles.crop(width * 22, height * 5, width, height);
		grassToDirtBL = sTiles.crop(width * 20, height * 6, width, height);
		grassToDirtBM = sTiles.crop(width * 21, height * 6, width, height);
		grassToDirtBR = sTiles.crop(width * 22, height * 6, width, height);
		grassToFlowerTL = sTiles.crop(width * 20, height * 7, width, height);
		grassToFlowerTM = sTiles.crop(width * 21, height * 7, width, height);
		grassToFlowerTR = sTiles.crop(width * 22, height * 7, width, height);
		grassToFlowerML = sTiles.crop(width * 20, height * 8, width, height);
		grassToFlowerMR = sTiles.crop(width * 22, height * 8, width, height);
		grassToFlowerBL = sTiles.crop(width * 20, height * 9, width, height);
		grassToFlowerBM = sTiles.crop(width * 21, height * 9, width, height);
		grassToFlowerBR = sTiles.crop(width * 22, height * 9, width, height);
		mazeFloor = sTiles.crop(0, height * 8, width, height);
		mazeWallTop = sTiles.crop(0, height * 5, width, height);
		mazeWallBottom = sTiles.crop(0, height * 6, width, height);
		mazeWallLeft = sTiles.crop(0, height * 7, width, height);
		mazeWallRight = sTiles.crop(width, height * 5, width, height);
		mazeWallTL = sTiles.crop(0, height * 3, width, height);
		mazeWallTR = sTiles.crop(width, height * 3, width, height);
		mazeWallBL = sTiles.crop(0, height * 4, width, height);
		mazeWallBR = sTiles.crop(width, height * 4, width, height);
		mazeCornerTL = sTiles.crop(width * 2, height * 6, width, height);
		mazeCornerTR = sTiles.crop(width * 3, height * 6, width, height);
		mazeCornerBL = sTiles.crop(width * 2, height * 7, width, height);
		mazeCornerBR = sTiles.crop(width * 3, height * 7, width, height);
		iceFloor1 = sTiles.crop(width * 4, height * 3, width, height);
		iceFloor2 = sTiles.crop(width * 5, height * 3, width, height);
		iceWallTop = sTiles.crop(width * 5, height * 4, width, height);
		iceWallBottom = sTiles.crop(width * 5, height * 5, width, height);
		iceWallLeft = sTiles.crop(width * 4, height * 6, width, height);
		iceWallRight = sTiles.crop(width * 5, height * 6, width, height);
		iceWallTL = sTiles.crop(width * 6, height * 3, width, height);
		iceWallTR = sTiles.crop(width * 7, height * 3, width, height);
		iceWallBL = sTiles.crop(width * 6, height * 4, width, height);
		iceWallBR = sTiles.crop(width * 7, height * 4, width, height);
		iceSlide = sTiles.crop(width * 4, height * 4, width, height);
		fireFloor1 = sTiles.crop(width * 4, height * 7, width, height);
		fireFloor2 = sTiles.crop(width * 5, height * 7, width, height);
		fireWallTop = sTiles.crop(width * 5, height * 8, width, height);
		fireWallBottom = sTiles.crop(width * 5, height * 9, width, height);
		fireWallLeft = sTiles.crop(width * 4, height * 10, width, height);
		fireWallRight = sTiles.crop(width * 5, height * 10, width, height);
		fireWallTL = sTiles.crop(width * 6, height * 7, width, height);
		fireWallTR = sTiles.crop(width * 7, height * 7, width, height);
		fireWallBL = sTiles.crop(width * 6, height * 8, width, height);
		fireWallBR = sTiles.crop(width * 7, height * 8, width, height);
		lava = sTiles.crop(width * 4, height * 9, width, height);
		digitalFloor = sTiles.crop(width * 8, height * 3, width, height);
		digitalWall = sTiles.crop(width * 8, height * 4, width, height);
		vines = sTiles.crop(width * 12, height * 4, width, height);
		swampDirt = sTiles.crop(width * 12, height * 5, width, height);
		tarBubble = sTiles.crop(width * 12, height * 6, width, height);
		tarBubblePop = sTiles.crop(width * 13, height * 6, width, height);
		tar = sTiles.crop(width * 14, height * 6, width, height);
		swampWallTL = sTiles.crop(width * 12, height * 7, width, height);
		swampWallTM = sTiles.crop(width * 13, height * 7, width, height);
		swampWallTR = sTiles.crop(width * 14, height * 7, width, height);
		swampWallML = sTiles.crop(width * 12, height * 8, width, height);
		swampWallMR = sTiles.crop(width * 14, height * 8, width, height);
		swampWallBL = sTiles.crop(width * 12, height * 9, width, height);
		swampWallBM = sTiles.crop(width * 13, height * 9, width, height);
		swampWallBR = sTiles.crop(width * 14, height * 9, width, height);
		carpetBorderTL = sTiles.crop(width * 16, height * 3, width, height);
		carpetBorderTM = sTiles.crop((int) (width * 16.5), height * 3, width, height);
		carpetBorderTR = sTiles.crop(width * 17, height * 3, width, height);
		carpetBorderMR = sTiles.crop(width * 16, (int)(height * 3.5), width, height);
		carpetBorderML = sTiles.crop(width * 17, (int)(height * 3.5), width, height);
		carpetBorderBL = sTiles.crop(width * 16, height * 4, width, height);
		carpetBorderBM = sTiles.crop((int) (width * 16.5), height * 4, width, height);
		carpetBorderBR = sTiles.crop(width * 17, height * 4, width, height);
		carpet = sTiles.crop(width * 16, height * 5, width, height);
		carpetHole = sTiles.crop(width * 16, height * 6, width, height);
		wood = sTiles.crop(width * 17, height * 5, width, height);
		woodHole = sTiles.crop(width * 17, height * 6, width, height);
		mansionWallTL = sTiles.crop(width * 16, height * 7, width, height);
		mansionWallTM = sTiles.crop((int)(width * 16.5), height * 7, width, height);
		mansionWallTR = sTiles.crop(width * 17, height * 7, width, height);
		mansionWallBL = sTiles.crop(width * 16, height * 8, width, height);
		mansionWallBM = sTiles.crop((int)(width * 16.5), height * 8, width, height);
		mansionWallBR = sTiles.crop(width * 17, height * 8, width, height);
		mansionWallBorderTL = sTiles.crop(width * 16, height * 9, width, height);
		mansionWallBorderTM = sTiles.crop((int)(width * 16.5), height * 9, width, height);
		mansionWallBorderTR = sTiles.crop(width * 17, height * 9, width, height);
		mansionWallBorderML = sTiles.crop(width * 16, (int)(height * 9.5), width, height);
		mansionWallBorderMR = sTiles.crop(width * 17, (int)(height * 9.5), width, height);
		mansionWallBorderBL = sTiles.crop(width * 16, height * 10, width, height);
		mansionWallBorderBM = sTiles.crop((int)(width * 16.5), height * 10, width, height);
		mansionWallBorderBR = sTiles.crop(width * 17, height * 10, width, height);
		riverTL = sTiles.crop(width * 20, height * 10, width, height);
		riverTM = sTiles.crop((int)(width * 20.5), height * 10, width, height);
		riverTR = sTiles.crop(width * 21, height * 10, width, height);
		riverML = sTiles.crop(width * 20, (int)(height * 10.5), width, height);
		riverMM = sTiles.crop((int)(width * 20.5), (int)(height * 10.5), width, height);
		riverMR = sTiles.crop(width * 21, (int)(height * 10.5), width, height);
		riverBL = sTiles.crop(width * 20, height * 11, width, height);
		riverBM = sTiles.crop((int)(width * 20.5), height * 11, width, height);
		riverBR = sTiles.crop(width * 21, height * 11, width, height);
		treeClusterTL = sTiles.crop(width * 20, height * 14, width, height);
		treeClusterTR = sTiles.crop(width * 21, height * 14, width, height);
		treeClusterBL = sTiles.crop(width * 20, height * 15, width, height);
		treeClusterBR = sTiles.crop(width * 21, height * 15, width, height);
		treeTL = sTiles.crop(width * 20, height * 16, width, height);
		treeTR = sTiles.crop(width * 21, height * 16, width, height);
		treeBL = sTiles.crop(width * 20, height * 17, width, height);
		treeBR = sTiles.crop(width * 21, height * 17, width, height);
		dungeonWallTL = sTiles.crop(width * 24, height * 3, width, height);
		dungeonWallTM = sTiles.crop((int)(width * 24.5), height * 3, width, height);
		dungeonWallTR = sTiles.crop(width * 25, height * 3, width, height);
		dungeonWallBL = sTiles.crop(width * 24, height * 4, width, height);
		dungeonWallBM = sTiles.crop((int)(width * 24.5), height * 4, width, height);
		dungeonWallBR = sTiles.crop(width * 25, height * 4, width, height);
		dungeonFloor = sTiles.crop(width * 24, height * 5, width, height);
		dungeonBorderTL = sTiles.crop(width * 24, height * 6, width, height);
		dungeonBorderTM = sTiles.crop((int)(width * 24.5), height * 6, width, height);
		dungeonBorderTR = sTiles.crop(width * 25, height * 6, width, height);
		dungeonBorderML = sTiles.crop(width * 24, (int)(height * 6.5), width, height);
		dungeonBorderMR = sTiles.crop(width * 25, (int)(height * 6.5), width, height);
		dungeonBorderBL = sTiles.crop(width * 24, height * 7, width, height);
		dungeonBorderBM = sTiles.crop((int)(width * 24.5), height * 7, width, height);
		dungeonBorderBR = sTiles.crop(width * 25, height * 7, width, height);
		cloudFloor = sTiles.crop(width * 28, height * 5, width, height);
		cloudWallTop = sTiles.crop(width * 29, height * 3, width, height);
		cloudWallBottom = sTiles.crop(width * 28, height * 3, width, height);
		cloudWallLeft = sTiles.crop(width * 28, height * 4, width, height);
		cloudWallRight = sTiles.crop(width * 29, height * 4, width, height);
		cloudWallTL = sTiles.crop(width * 30, height * 3, width, height);
		cloudWallTR = sTiles.crop(width * 31, height * 3, width, height);
		cloudWallBL = sTiles.crop(width * 30, height * 4, width, height);
		cloudWallBR = sTiles.crop(width * 31, height * 4, width, height);
		sky  = sTiles.crop(width * 30, height * 5, width, height);
		shipFloor = sTiles.crop(width * 36, height * 18, width, height);
		shipWallTL = sTiles.crop(width * 32, height * 3, width, height);
		shipWallTM = sTiles.crop((int)(width * 32.5), height * 3, width, height);
		shipWallTR = sTiles.crop(width * 33, height * 3, width, height);
		shipWallBL = sTiles.crop(width * 32, height * 4, width, height);
		shipWallBM = sTiles.crop((int)(width * 32.5), height * 4, width, height);
		shipWallBR = sTiles.crop(width * 33, height * 4, width, height);
		shipBorderBlankTopL = sTiles.crop(width * 34, height * 13, width, height);
		shipBorderBlankMiddleL = sTiles.crop(width * 34, height * 14, width, height);
		shipBorderBlankBottomL = sTiles.crop(width * 34, height * 15, width, height);
		shipBorderBlankTopR = sTiles.crop(width * 35, height * 13, width, height);
		shipBorderBlankMiddleR = sTiles.crop(width * 35, height * 14, width, height);
		shipBorderBlankBottomR = sTiles.crop(width * 35, height * 15, width, height);
		shipBorderCornerBR = sTiles.crop(width * 31, height * 15, width, height);
		shipBorderCornerBL = sTiles.crop(width * 30, height * 15, width, height);
		shipBorderBottomL = sTiles.crop(width * 31, height * 16, width, height);
		shipBorderBottomM = sTiles.crop(width * 32, height * 16, width, height);
		shipBorderBottomR = sTiles.crop(width * 33, height * 16, width, height);
		shipBorderWaterTopL = sTiles.crop(width * 34, height * 16, width, height);
		shipBorderWaterMiddleL = sTiles.crop(width * 34, height * 17, width, height);
		shipBorderWaterBottomL = sTiles.crop(width * 34, height * 18, width, height);
		shipBorderWaterTopR = sTiles.crop(width * 35, height * 16, width, height);
		shipBorderWaterMiddleR = sTiles.crop(width * 35, height * 17, width, height);
		shipBorderWaterBottomR = sTiles.crop(width * 35, height * 18, width, height);
		water = sTiles.crop(width * 35, height * 3, width, height);
		tilePit = sTiles.crop(0, height * 11, width, height);
		blank  = sTiles.crop(0, height * 11, width, height);
		stairsLeft = sTiles.crop(width * 16, height * 32, width, height);
		stairsMiddle = sTiles.crop(width * 17, height * 32, width, height);
		stairsRight = sTiles.crop(width * 18, height * 32, width, height);
		stairsFull = sTiles.crop(width * 19, height * 32, width, height);
		houseWallTL = sTiles.crop(width * 38, height * 16, width, height);
		houseWallTM = sTiles.crop((int)(width * 38.5), height * 16, width, height);
		houseWallTR = sTiles.crop(width * 39, height * 16, width, height);
		houseWallBL = sTiles.crop(width * 38, height * 17, width, height);
		houseWallBM = sTiles.crop((int)(width * 38.5), height * 17, width, height);
		houseWallBR = sTiles.crop(width * 39, height * 17, width, height);
		houseFloor = sTiles.crop(width * 34, height * 3, width, height);
		houseWallBorderTL = sTiles.crop(width * 38, height * 16, width, height);
		houseWallBorderTM = sTiles.crop((int)(width * 38.5), height * 16, width, height);
		houseWallBorderTR = sTiles.crop(width * 39, height * 16, width, height);
		houseWallBorderML = sTiles.crop(width * 38, (int)(height * 16.5), width, height);
		houseWallBorderMR = sTiles.crop(width * 39, (int)(height * 16.5), width, height);
		houseWallBorderBL = sTiles.crop(width * 38, height * 17, width, height);
		houseWallBorderBM = sTiles.crop((int)(width * 38.5), height * 17, width, height);
		houseWallBorderBR = sTiles.crop(width * 39, height * 17, width, height);
		cobbleFloor = sTiles.crop(width * 28, height * 18, width, height);
		brokenCobbleFloor = sTiles.crop(width * 28, height * 19, width, height);
		crackedStairs = sTiles.crop(width * 28, height * 20, width, height);
		houseBorderTLCorner = sTiles.crop(width * 15, height * 5, width, height);
		houseBorderTRCorner = sTiles.crop(width * 14, height * 5, width, height);
		houseBorderBLCorner = sTiles.crop(width * 15, height * 4, width, height);
		houseBorderBRCorner = sTiles.crop(width * 14, height * 4, width, height);
		dungeonBorderTLCorner = sTiles.crop(width * 27, height * 6, width, height);
		dungeonBorderTRCorner = sTiles.crop(width * 26, height * 6, width, height);
		dungeonBorderBLCorner = sTiles.crop(width * 27, height * 5, width, height);
		dungeonBorderBRCorner = sTiles.crop(width * 26, height * 5, width, height);
		
		
		airPiller = sTiles.crop(width * 23, height * 22, width, height * 2);
		soldOut = sTiles.crop(width * 21, height * 22, width, height);
		shelfShopLeft = sTiles.crop(width * 36, height * 19, width, height * 3);
		shelfShopRight = sTiles.crop(width * 39, height * 18, width, height * 3);
		shelfShopBottom = sTiles.crop(width * 37, height * 21, width * 3, height * 2);
		fenceSide  = sTiles.crop(width * 28, height * 22, width, height * 2);
		fenceFull = sTiles.crop(width * 30, height * 22, width * 2, height);
		
		transportDoor = sTiles.crop(width * 3, 0, width, height);
		textBox = sTiles.crop(0, height * 31, width * 16, height * 4);

		// Maze
		mazeEntrance = sTiles.crop(0, 0, width * 3, height * 3);

		fountain = sTiles.crop(0, height * 12, width * 3, height * 3);
		skeleton = sTiles.crop(width, height * 7, width, height);
		mazeStatue = sTiles.crop(width * 2, height * 3, width, height * 2);
		mazePit = sTiles.crop(0, height * 15, width * 3, height * 3);
		mazeCrate = sTiles.crop(width * 3, height * 18, width, height);
		mazeWallTemp = sTiles.crop(width, height * 6, width, height);
		target = sTiles.crop(width * 2, height * 5, width, height);


		mazeButtonUnpressed = sTiles.crop(0, height * 19, width, height);
		mazeButtonPressed = sTiles.crop(width * 3, height * 19, width, height);

		// Fire Ice
		fire_IceEntrance = sTiles.crop(width * 4, height, width * 3, height * 2);
		
		fireDragon = sTiles.crop(width * 4, height * 11, width * 2, height * 2);
		iceDragon = sTiles.crop(width * 4, height * 13, width * 2, height * 2);

		icePillerS = sTiles.crop(width * 4, height * 17, width, height);
		icePillerM = sTiles.crop(width * 4, height * 16, width, height);
		icePillerL = sTiles.crop(width * 5, height * 16, width, height * 2);
		firePillerL = sTiles.crop(width * 6, height * 16, width, height * 2);
		firePillerM = sTiles.crop(width * 6, height * 15, width, height);
		meltPiller = sTiles.crop(width * 7, height * 16, width, height * 2);
		puddle = sTiles.crop(width * 7, height * 15, width, height);
		fireIceCrate = sTiles.crop(width * 7, height * 19, width, height);
		fireSwitch = sTiles.crop(width * 4, height * 21, width, height);
		iceSwitch = sTiles.crop(width * 5, height * 21, width, height);
		
		crackFloor = new BufferedImage[4];
		
		crackFloor[0] = sTiles.crop(width * 5, height * 22, width, height);
		crackFloor[1] = sTiles.crop(width * 6, height * 22, width, height);
		crackFloor[2] = sTiles.crop(width * 7, height * 22, width, height);
		crackFloor[3] = sTiles.crop(width * 8, height * 22, width, height);

		fireIceButtonUnpressed = sTiles.crop(width * 4, height * 20, width, height);
		fireIceButtonPressed = sTiles.crop(width * 7, height * 20, width, height);

		// Digital
		digitalEntrance = sTiles.crop(width * 8, height, width * 3, height * 2);
		
		digitalTempWall = sTiles.crop(width * 9, height * 4, width, height);
		tronPiller = sTiles.crop(width* 9, height * 5, width, height * 2);
		digitalCrate = sTiles.crop(width * 8, height * 5, width, height);

		digitalButtonUnpressed = sTiles.crop(width * 8, height * 7, width, height);
		digitalButtonPressed = sTiles.crop(width * 11, height * 7, width, height);

		// Swamp
		swampEntrance = sTiles.crop(width * 12, height, width * 3, height * 2);
		vine = sTiles.crop(width * 13, height * 3, width, height * 2);
		mushroom = sTiles.crop(width * 12, height * 10, width, height);
		lilyPad = sTiles.crop(width * 13, height * 10, width, height);
		lilyPads = sTiles.crop(width * 13, height * 11, width, height);
		swampTree = sTiles.crop(width * 14, height * 10, width, height * 2);
		swampCrate = sTiles.crop(width * 13, height * 13, width, height);
		swampLog = sTiles.crop(width * 12, height * 14, width * 2, height);

		swampButtonUnpressed = sTiles.crop(width * 12, height * 12, width, height);
		swampButtonPressed = sTiles.crop(width * 15, height * 12, width, height);

		// Mansion
		mansionEntrance = sTiles.crop(width * 16, 0, width * 3, height * 3);
		
		diningChairLeft = sTiles.crop(width * 18, height * 11, width, height * 2);
		diningChairRight = sTiles.crop(width * 19, height * 11, width, height * 2);
		diningChairUp = sTiles.crop(width * 16, height * 11, width, height * 2);
		diningChairDown = sTiles.crop(width * 17, height * 11, width, height * 2);
		bookshelf = sTiles.crop(width * 18, height * 16, width, height * 3);
		toilet = sTiles.crop(width * 19, height * 5, width, height * 2);
		dresserLeft = sTiles.crop(width * 16, height * 15, width, height * 3);
		dresserRight = sTiles.crop(width * 18, height * 5, width, height * 3);
		dresserDown = sTiles.crop(width * 16, height * 13, width * 2, height * 2);
		candle = sTiles.crop(width * 18, height * 10, width, height);
		nightstand = sTiles.crop(width * 18, height * 9, width, height);
		sink = sTiles.crop(width * 19, height * 7, width, height);
		bed = sTiles.crop(width * 18, height * 13, width * 2, height * 3);
		foodShelf = sTiles.crop(width * 19, height * 8, width, height * 3);
		clock = sTiles.crop(width * 19, height * 16, width, height * 2);
		candle2 = sTiles.crop(width * 17, height * 15, width, height);
		stoolFancy = sTiles.crop(width * 17, height * 16, width, height);
		wallshelf = sTiles.crop(width * 17, height * 17, width, height);
		coffin = sTiles.crop(width * 19, height * 18, width, height * 2);
		sofaLeft = sTiles.crop(width * 16, height * 19, width, height * 3);
		sofaRight = sTiles.crop(width * 17, height * 19, width, height * 3);
		chairLeft = sTiles.crop(width * 18, height * 21, width, height);
		chairRight = sTiles.crop(width * 19, height * 21, width, height);
		chairrDown = sTiles.crop(width * 18, height * 20, width, height);
		chairUp = sTiles.crop(width * 19, height * 20, width, height);
		table = sTiles.crop(width * 16, height * 22, width * 3, height * 2);
		diningtable = sTiles.crop(width * 16, height * 24, width * 2, height * 2);
		bathtub = sTiles.crop(width * 19, height * 22, width, height * 3);
		lightTargetLit = sTiles.crop(width * 18, height * 24, width, height);
		lightTargetUnlit = sTiles.crop(width * 18, height * 25, width, height);
		throne = sTiles.crop(width * 19, height * 25, width, height * 3);
		piano = sTiles.crop(width * 16, height * 26, width * 3, height * 3);
		fireplace = sTiles.crop(width * 16, height * 29, width * 2, height * 2);
		light = sTiles.crop(width * 20, height * 33, width, height);
		windowOpen = sTiles.crop(width * 19, height * 3, width, height * 2);
		windowClosed = sTiles.crop(width * 18, height * 3, width, height * 2);
		mansionCrate = sTiles.crop(width * 19, height * 29, width, height);
		mansionBanisterBroken = sTiles.crop(width * 20, height * 22, width, height);
		mansionBanister = sTiles.crop(width * 20, height * 23, width, height);
		mansionBanisterLeft = sTiles.crop(width * 21, height * 24, width, height);
		mansionBanisterRight = sTiles.crop(width * 20, height * 24, width, height);
		mansionTempWall = sTiles.crop(width * 15, height * 9, width, height);

		fire = new BufferedImage[5];

		fire[0] = sTiles.crop(width * 16, height * 31, width, height);
		fire[1] = sTiles.crop(width * 17, height * 31, width, height);
		fire[2] = sTiles.crop(width * 18, height * 31, width, height);
		fire[3] = sTiles.crop(width * 19, height * 31, width, height);
		fire[4] = sTiles.crop(width * 20, height * 31, width, height);

		blackFire = new BufferedImage[5];

		blackFire[0] = sTiles.crop(width * 16, height * 34, width, height);
		blackFire[1] = sTiles.crop(width * 17, height * 34, width, height);
		blackFire[2] = sTiles.crop(width * 18, height * 34, width, height);
		blackFire[3] = sTiles.crop(width * 19, height * 34, width, height);
		blackFire[4] = sTiles.crop(width * 20, height * 34, width, height);

		mansionButtonUnpressed = sTiles.crop(width * 16, height * 33, width, height);
		mansionButtonPressed = sTiles.crop(width * 19, height * 33, width, height);

		// Forest
		forestEntrance = sTiles.crop(width * 20, height, width * 3, height * 2);
		tree = sTiles.crop(width * 20, height * 21, width * 2, height * 2);
		leafPile = sTiles.crop(width * 20, height * 18, width, height);
		forestCrate = sTiles.crop(width * 21, height * 18, width, height);
		bramble = sTiles.crop(width * 22, height * 10, width, height);
		brokenPiller1 = sTiles.crop(width * 25, height * 20, width, height);
		brokenPiller2 = sTiles.crop(width * 26, height * 20, width, height);
		wallRuinsB = sTiles.crop(width * 22, height * 16, width * 6, height * 2);
		wallRuinsS = sTiles.crop(width * 25, height * 18, width * 2, height * 2);
		
		fanBlast = sTiles.crop(width * 22, height * 19, width, height);
		
		fanAuto = new BufferedImage[4];
		
		fanAuto[0] = sTiles.crop(width * 20, height * 20, width, height);
		fanAuto[1] = sTiles.crop(width * 21, height * 20, width, height);
		fanAuto[2] = sTiles.crop(width * 22, height * 20, width, height);
		fanAuto[3] = sTiles.crop(width * 23, height * 20, width, height);

		// Dungeon
		DungeonEntrance = sTiles.crop(width * 24, height, width * 3, height * 2);
		
		bossDoor = sTiles.crop(width * 24, height * 10, width, height);
		dungeonDoorLUp = sTiles.crop(width * 25, height * 8, width, height);
		dungeonDoorLDown = sTiles.crop(width * 25, height * 10, width, height);
		dungeonDoorLLeft = sTiles.crop(width * 24, height * 9, width, height);
		dungeonDoorLRight = sTiles.crop(width * 26, height * 9, width, height);
		dungeonDoorUUp = sTiles.crop(width * 25, height * 11, width, height);
		dungeonDoorUDown = sTiles.crop(width * 25, height * 13, width, height);
		dungeonDoorULeft = sTiles.crop(width * 24, height * 12, width, height);
		dungeonDoorURight = sTiles.crop(width * 26, height * 12, width, height);
		dungeonCrate = sTiles.crop(width * 27, height * 13, width, height);
		skeletonHanging = sTiles.crop(width * 26, height * 7, width, height * 2);
		bonePile = sTiles.crop(width * 27, height * 8, width, height);
		dungeonTempWall= sTiles.crop(width * 23, height * 6, width, height);


		dungeonButtonUnpressed = sTiles.crop(width * 24, height * 14, width, height);
		dungeonButtonPressed = sTiles.crop(width * 27, height * 14, width, height);

		// Sky
		skyEntrance = sTiles.crop(width * 28, height, width * 3, height * 2);
		skyTempWall = sTiles.crop(width * 31, height * 5, width, height);
		
		skyCrate = sTiles.crop(width * 29, height * 5, width, height);

		skyButtonUnpressed = sTiles.crop(width * 28, height * 6, width, height);
		skyButtonPressed = sTiles.crop(width * 31, height * 6, width, height);

		// Ship
		shipEntrance = sTiles.crop(width * 32, height, width * 3, height * 2);
		
		shipCrate = sTiles.crop(width * 32, height * 24, width, height);
		ropeLadderUp = sTiles.crop(width * 32, height * 5, width, height * 2);
		ropeLadderDown = sTiles.crop(width * 33, height * 5, width, height);
		map = sTiles.crop(width * 33, height * 6, width * 2, height);
		sackStack = sTiles.crop(width * 34, height * 4, width, height * 2);
		openSack = sTiles.crop(width * 35, height * 5, width, height);
		mast = sTiles.crop(width * 32, height * 9, width, height * 3);
		jailWall = sTiles.crop(width * 32, height * 7, width * 3, height * 2);
		shipWheel = sTiles.crop(width * 33, height * 9, width, height * 2);
		ropeCoil = sTiles.crop(width * 33, height * 11, width, height);
		anchor = sTiles.crop(width * 35, height * 11, width, height);
		brokenTable = sTiles.crop(width * 34, height * 10, width, height);
		shipBanisterBroken = sTiles.crop(width * 32, height * 13, width, height);
		shipBanister = sTiles.crop(width * 32, height * 14, width, height);
		shipBanisterLeft = sTiles.crop(width * 33, height * 15, width, height);
		shipBanisterRight = sTiles.crop(width * 32, height * 15, width, height);
		shipTempWall = sTiles.crop(width * 31, height * 13, width, height);
		shipAft = sTiles.crop(width * 30, height * 17, width * 4, height * 3);
		shipBow = sTiles.crop(width * 31, height * 27, width * 7, height * 4);
		shipHole = sTiles.crop(width * 37, height * 18, width, height);
		
		climbRope = sTiles.crop(width * 38, height * 18, width, height);
		crackedShipFloor = sTiles.crop(width * 38, height * 19, width, height);

		shipButtonUnpressed = sTiles.crop(width * 32, height * 21, width, height);
		shipButtonPressed = sTiles.crop(width * 35, height * 21, width, height);
		
		
		//Random
		hole = sTiles.crop(width * 36, height * 13, width, height);
		bedS = sTiles.crop(width * 36, height * 3, width, height * 2);
		stool = sTiles.crop(width * 37, height * 3, width, height);
		washBucket = sTiles.crop(width * 37, height * 4, width, height);
		cart = sTiles.crop(width * 38, height * 3, width * 2, height * 2);
		well = sTiles.crop(width * 38, height * 5, width * 2, height * 3);
		outhouse = sTiles.crop(width * 37, height * 5, width, height * 2);
		sign = sTiles.crop(width * 37, height * 7, width, height);
		clockS = sTiles.crop(width * 36, height * 5, width, height);
		dresserS = sTiles.crop(width * 36, height * 6, width, height * 2);
		stump = sTiles.crop(width * 39, height * 8, width, height);
		hayStack = sTiles.crop(width * 36, height * 9, width * 2, height * 2);
		waterTrough = sTiles.crop(width * 38, height * 9, width * 2, height);
		hayTrough = sTiles.crop(width * 38, height * 10, width * 2, height);
		field = sTiles.crop(width * 37, height * 11, width  * 3, height * 3);
		tableP = sTiles.crop(width * 36, height * 14, width * 2, height * 2);
		rug = sTiles.crop(width * 38, height * 14, width * 2, height * 2);
		
		shelfLeft = sTiles.crop(width * 36, height * 19, width, height * 3);
		shelfRight = sTiles.crop(width * 39, height * 19, width, height * 3);
		shelfMiddle = sTiles.crop(width * 37, height * 21, width * 2, height);


		// Houses
		SpriteSheet house = new SpriteSheet(ImageLoader.loadImage("/textures/Houses.png"));

		flatG = house.crop(0, 0, width * 10, height * 10);
		flatS = house.crop(width * 10, 0, width * 10, height * 10);
		flatR = house.crop(width * 20, 0, width * 10, height * 10);
		flatO = house.crop(width * 30, 0, width * 10, height * 10);

		turn1G = house.crop(0, height * 10, width * 8, height * 18);
		turn2G = house.crop(width * 8, height * 10, width * 8, height * 14);
		turn1S = house.crop(width * 16, height * 10, width * 8, height * 18);
		turn2S = house.crop(width * 24, height * 10, width * 8, height * 14);
		turn1R = house.crop(width * 32, height * 10, width * 8, height * 18);
		turn2R = house.crop(width * 40, height * 10, width * 8, height * 14);
		turn1O = house.crop(width * 48, height * 10, width * 8, height * 18);
		turn2O = house.crop(width * 56, height * 10, width * 8, height * 14);

		serp1G = house.crop(width * 6, height * 28, width * 8, height * 18);
		serp2G = house.crop(width * 14, height * 28, width * 6, height * 14);
		serp3G = house.crop(0, height * 36, width * 6, height * 10);
		serp1S = house.crop(width * 26, height * 28, width * 8, height * 18);
		serp2S = house.crop(width * 34, height * 28, width * 6, height * 14);
		serp3S = house.crop(width * 20, height * 36, width * 6, height * 10);
		serp1R = house.crop(width * 46, height * 28, width * 8, height * 18);
		serp2R = house.crop(width * 54, height * 28, width * 6, height * 14);
		serp3R = house.crop(width * 40, height * 36, width * 6, height * 10);
		serp1O = house.crop(width * 6, height * 46, width * 8, height * 18);
		serp2O = house.crop(width * 14, height * 46, width * 6, height * 14);
		serp3O = house.crop(0, height * 54, width * 6, height * 10);

		door = house.crop(width * 40, 0, width * 2, height * 2);

		// MainMenu
		SpriteSheet BG = new SpriteSheet(ImageLoader.loadImage("/textures/MMBG.png"));
		SpriteSheet BGCS = new SpriteSheet(ImageLoader.loadImage("/textures/MMBG2.png"));

		menuBG = BG.crop(0, 0, 1024, 768);
		menuBGCS = BGCS.crop(0, 0, 1024, 768);

		// Pause
		SpriteSheet PBG = new SpriteSheet(ImageLoader.loadImage("/textures/PBG.png"));
		pauseBG = PBG.crop(0, 0, 1024, 768);

		// Intro
		SpriteSheet Intro = new SpriteSheet(ImageLoader.loadImage("/textures/intro.png"));
		intro = Intro.crop(0, 0, 1024, 763);

		// GameOver
		SpriteSheet gameOver = new SpriteSheet(ImageLoader.loadImage("/textures/GameOver.png"));
		gameOverBG = gameOver.crop(0, 0, 1024, 763);
		
		SpriteSheet story = new SpriteSheet(ImageLoader.loadImage("/textures/Story.png"));
		storyBG = story.crop(0, 0, 1024, 1534);

	}
}
