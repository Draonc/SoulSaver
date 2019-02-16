package dev.SoulSaver.tiles;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.HashMap;

import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.utils.Pair;

/**
 * This class sets up the tiles and their attributes.
 *
 */
public class Tile {
	
	HashMap<Integer, Pair<BufferedImage, Boolean>> tile = new HashMap<Integer,Pair<BufferedImage, Boolean>>();
	//CLASS
	
	public static final int TILEWIDTH = 64, TILEHEIGHT = 64;

	
	public Tile(){
		makeMap();
	}
	
	public void tick(){
	}
	
	private BufferedImage setImage(int id){
		try{
			return tile.get(id).getFirst();	
		}catch(NullPointerException e){
			return Assets.grass;
		}	
	}
	
	
	//adds the tile keys and their attributes to the hashmap.
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void makeMap(){		
		tile.put(0, new Pair(Assets.grass,false, false, false, false));
		tile.put(1, new Pair(Assets.dirt,false, false, false, false));
		tile.put(2, new Pair(Assets.flower,false, false, false, false));
		tile.put(3, new Pair(Assets.grassToDirtTL,false, false, false, false));
		tile.put(4, new Pair(Assets.grassToDirtTM,false, false, false, false));
		tile.put(5, new Pair(Assets.grassToDirtTR,false, false, false, false));
		tile.put(6, new Pair(Assets.grassToDirtML,false, false, false, false));
		tile.put(7, new Pair(Assets.grassToDirtMR,false, false, false, false));
		tile.put(8, new Pair(Assets.grassToDirtBL,false, false, false, false));
		tile.put(9, new Pair(Assets.grassToDirtBM,false, false, false, false));
		tile.put(10, new Pair(Assets.grassToDirtBR,false, false, false, false));
		tile.put(11, new Pair(Assets.grassToFlowerTL,false, false, false, false));
		tile.put(12, new Pair(Assets.grassToFlowerTM,false, false, false, false));
		tile.put(13, new Pair(Assets.grassToFlowerTR,false, false, false, false));
		tile.put(14, new Pair(Assets.grassToFlowerML,false, false, false, false));
		tile.put(15, new Pair(Assets.grassToFlowerMR,false, false, false, false));
		tile.put(16, new Pair(Assets.grassToFlowerBL,false, false, false, false));
		tile.put(17, new Pair(Assets.grassToFlowerBM,false, false, false, false));
		tile.put(18, new Pair(Assets.grassToFlowerBR,false, false, false, false));
		tile.put(19, new Pair(Assets.mazeFloor,false, false, false, false));
		tile.put(20, new Pair(Assets.mazeWallTop,true, false, false, false));
		tile.put(21, new Pair(Assets.mazeWallBottom, true, false, false, false));
		tile.put(22, new Pair(Assets.mazeWallLeft, true, false, false, false));
		tile.put(23, new Pair(Assets.mazeWallRight, true, false, false, false));
		tile.put(24, new Pair(Assets.mazeWallTL, true, false, false, false));
		tile.put(25, new Pair(Assets.mazeWallTR, true, false, false, false));
		tile.put(26, new Pair(Assets.mazeWallBL, true, false, false, false));
		tile.put(27, new Pair(Assets.mazeWallBR, true, false, false, false));
		tile.put(28, new Pair(Assets.iceFloor1,false, false, false, false));
		tile.put(29, new Pair(Assets.iceFloor2,false, false, false, false));
		tile.put(30, new Pair(Assets.iceWallTop, true, false, false, false));
		tile.put(31, new Pair(Assets.iceWallBottom, true, false, false, false));
		tile.put(32, new Pair(Assets.iceWallLeft, true, false, false, false));
		tile.put(33, new Pair(Assets.iceWallRight, true, false, false, false));
		tile.put(34, new Pair(Assets.iceWallTL, true, false, false, false));
		tile.put(35, new Pair(Assets.iceWallTR, true, false, false, false));
		tile.put(36, new Pair(Assets.iceWallBL, true, false, false, false));
		tile.put(37, new Pair(Assets.iceWallBR, true, false, false, false));
		tile.put(38, new Pair(Assets.iceSlide, false, false, false, true));
		tile.put(39, new Pair(Assets.fireFloor1, false, false, false, false));
		tile.put(40, new Pair(Assets.fireFloor2, false, false, false, false));
		tile.put(41, new Pair(Assets.fireWallTop, true, false, false, false));
		tile.put(42, new Pair(Assets.fireWallBottom,true, false, false, false));
		tile.put(43, new Pair(Assets.fireWallLeft, true, false, false, false));
		tile.put(44, new Pair(Assets.fireWallRight, true, false, false, false));
		tile.put(45, new Pair(Assets.fireWallTL, true, false, false, false));
		tile.put(46, new Pair(Assets.fireWallTR, true, false, false, false));
		tile.put(47, new Pair(Assets.fireWallBL, true, false, false, false));
		tile.put(48, new Pair(Assets.fireWallBR, true, false, false, false));
		tile.put(49, new Pair(Assets.lava,false, false, true, false));
		tile.put(50, new Pair(Assets.digitalFloor,false, false, false, false));
		tile.put(51, new Pair(Assets.digitalWall, true, false, false, false));
		tile.put(52, new Pair(Assets.vines, true, false, false, false));
		tile.put(53, new Pair(Assets.swampDirt,false, false, false, false));
		tile.put(54, new Pair(Assets.tarBubble,false, false, true, false));
		tile.put(55, new Pair(Assets.tarBubblePop,false, false, true, false));
		tile.put(56, new Pair(Assets.tar,false, false, true, false));
		tile.put(57, new Pair(Assets.swampWallTL, true, false, false, false));
		tile.put(58, new Pair(Assets.swampWallTM, true, false, false, false));
		tile.put(59, new Pair(Assets.swampWallTR, true, false, false, false));
		tile.put(60, new Pair(Assets.swampWallML, true, false, false, false));
		tile.put(61, new Pair(Assets.swampWallMR, true, false, false, false));
		tile.put(62, new Pair(Assets.swampWallBL, true, false, false, false));
		tile.put(63, new Pair(Assets.swampWallBM, true, false, false, false));
		tile.put(64, new Pair(Assets.swampWallBR, true, false, false, false));
		tile.put(65, new Pair(Assets.carpetBorderTL,false, false, false, false));
		tile.put(66, new Pair(Assets.carpetBorderTM,false, false, false, false));
		tile.put(67, new Pair(Assets.carpetBorderTR,false, false, false, false));
		tile.put(68, new Pair(Assets.carpetBorderMR,false, false, false, false));
		tile.put(69, new Pair(Assets.carpetBorderML,false, false, false, false));
		tile.put(70, new Pair(Assets.carpetBorderBL,false, false, false, false));
		tile.put(71, new Pair(Assets.carpetBorderBM,false, false, false, false));
		tile.put(72, new Pair(Assets.carpetBorderBR,false, false, false, false));
		tile.put(73, new Pair(Assets.carpet,false, false, false, false));
		tile.put(74, new Pair(Assets.carpetHole,false, false, false, false));
		tile.put(75, new Pair(Assets.wood,false, false, false, false));
		tile.put(76, new Pair(Assets.woodHole,false, false, false, false));
		tile.put(77, new Pair(Assets.mansionWallTL, true, false, false, false));
		tile.put(78, new Pair(Assets.mansionWallTM, true, false, false, false));
		tile.put(79, new Pair(Assets.mansionWallTR, true, false, false, false));
		tile.put(80, new Pair(Assets.mansionWallBL, true, false, false, false));
		tile.put(81, new Pair(Assets.mansionWallBM, true, false, false, false));
		tile.put(82, new Pair(Assets.mansionWallBR, true, false, false, false));
		tile.put(83, new Pair(Assets.mansionWallBorderTL, true, false, false, false));
		tile.put(84, new Pair(Assets.mansionWallBorderTM, true, false, false, false));
		tile.put(85, new Pair(Assets.mansionWallBorderTR, true, false, false, false));
		tile.put(86, new Pair(Assets.mansionWallBorderML, true, false, false, false));
		tile.put(87, new Pair(Assets.mansionWallBorderMR, true, false, false, false));
		tile.put(88, new Pair(Assets.mansionWallBorderBL, true, false, false, false));
		tile.put(89, new Pair(Assets.mansionWallBorderBM, true, false, false, false));
		tile.put(90, new Pair(Assets.mansionWallBorderBR, true, false, false, false));
		tile.put(91, new Pair(Assets.riverTL, true, false, false, false));
		tile.put(92, new Pair(Assets.riverTM, true, false, false, false));
		tile.put(93, new Pair(Assets.riverTR, true, false, false, false));
		tile.put(94, new Pair(Assets.riverML, true, false, false, false));
		tile.put(95, new Pair(Assets.riverMM, true, false, false, false));
		tile.put(96, new Pair(Assets.riverMR, true, false, false, false));
		tile.put(97, new Pair(Assets.riverBL, true, false, false, false));
		tile.put(98, new Pair(Assets.riverBM, true, false, false, false));
		tile.put(99, new Pair(Assets.riverBR, true, false, false, false));
		tile.put(100, new Pair(Assets.treeClusterTL, true, false, false, false));
		tile.put(101, new Pair(Assets.treeClusterTR, true, false, false, false));
		tile.put(102, new Pair(Assets.treeClusterBL, true, false, false, false));
		tile.put(103, new Pair(Assets.treeClusterBR, true, false, false, false));
		tile.put(104, new Pair(Assets.treeTL, true, false, false, false));
		tile.put(105, new Pair(Assets.treeTR, true, false, false, false));
		tile.put(106, new Pair(Assets.treeBL, true, false, false, false));
		tile.put(107, new Pair(Assets.treeBR, true, false, false, false));
		tile.put(108, new Pair(Assets.dungeonWallTL, true, false, false, false));
		tile.put(109, new Pair(Assets.dungeonWallTM, true, false, false, false));
		tile.put(110, new Pair(Assets.dungeonWallTR, true, false, false, false));
		tile.put(111, new Pair(Assets.dungeonWallBL, true, false, false, false));
		tile.put(112, new Pair(Assets.dungeonWallBM, true, false, false, false));
		tile.put(113, new Pair(Assets.dungeonWallBR, true, false, false, false));
		tile.put(114, new Pair(Assets.dungeonFloor, false, false, false, false));
		tile.put(115, new Pair(Assets.dungeonBorderTL, true, false, false, false));
		tile.put(116, new Pair(Assets.dungeonBorderTM, true, false, false, false));
		tile.put(117, new Pair(Assets.dungeonBorderTR, true, false, false, false));
		tile.put(118, new Pair(Assets.dungeonBorderML, true, false, false, false));
		tile.put(119, new Pair(Assets.dungeonBorderMR, true, false, false, false));
		tile.put(120, new Pair(Assets.dungeonBorderBL, true, false, false, false));
		tile.put(121, new Pair(Assets.dungeonBorderBM, true, false, false, false));
		tile.put(122, new Pair(Assets.dungeonBorderBR, true, false, false, false));
		tile.put(123, new Pair(Assets.cloudFloor,false, false, false, false));
		tile.put(124, new Pair(Assets.cloudWallTop, true, false, false, false));
		tile.put(125, new Pair(Assets.cloudWallBottom, true, false, false, false));
		tile.put(126, new Pair(Assets.cloudWallLeft, true, false, false, false));
		tile.put(127, new Pair(Assets.cloudWallRight, true, false, false, false));
		tile.put(128, new Pair(Assets.cloudWallTL, true, false, false, false));
		tile.put(129, new Pair(Assets.cloudWallTR, true, false, false, false));
		tile.put(130, new Pair(Assets.cloudWallBL, true, false, false, false));
		tile.put(131, new Pair(Assets.cloudWallBR, true, false, false, false));
		tile.put(132, new Pair(Assets.shipFloor,false, false, false, false));
		tile.put(133, new Pair(Assets.shipWallTL, true, false, false, false));
		tile.put(134, new Pair(Assets.shipWallTM, true, false, false, false));
		tile.put(135, new Pair(Assets.shipWallTR, true, false, false, false));
		tile.put(136, new Pair(Assets.shipWallBL, true, false, false, false));
		tile.put(137, new Pair(Assets.shipWallBM, true, false, false, false));
		tile.put(138, new Pair(Assets.shipWallBR, true, false, false, false));
		tile.put(139, new Pair(Assets.shipBorderBlankTopL, true, false, false, false));
		tile.put(140, new Pair(Assets.shipBorderBlankMiddleL, true, false, false, false));
		tile.put(141, new Pair(Assets.shipBorderBlankBottomL, true, false, false, false));
		tile.put(142, new Pair(Assets.shipBorderBlankTopR, true, false, false, false));
		tile.put(143, new Pair(Assets.shipBorderBlankMiddleR, true, false, false, false));
		tile.put(144, new Pair(Assets.shipBorderBlankBottomR, true, false, false, false));
		tile.put(145, new Pair(Assets.shipBorderWaterTopL, true, false, false, false));
		tile.put(146, new Pair(Assets.shipBorderWaterMiddleL, true, false, false, false));
		tile.put(147, new Pair(Assets.shipBorderWaterBottomL, true, false, false, false));
		tile.put(148, new Pair(Assets.shipBorderWaterTopR, true, false, false, false));
		tile.put(149, new Pair(Assets.shipBorderWaterMiddleR, true, false, false, false));
		tile.put(150, new Pair(Assets.shipBorderWaterBottomR, true, false, false, false));
		tile.put(151, new Pair(Assets.water, true, false, false, false));
		tile.put(152, new Pair(Assets.tilePit,false, true, false, false));
		tile.put(153, new Pair(Assets.blank,false, false, false, false));
		tile.put(154, new Pair(Assets.stairsLeft,false, false, false, false));
		tile.put(155, new Pair(Assets.stairsMiddle,false, false, false, false));
		tile.put(156, new Pair(Assets.stairsRight,false, false, false, false));
		tile.put(157, new Pair(Assets.stairsFull,false, false, false, false));
		tile.put(158, new Pair(Assets.houseWallTL,true, false, false, false));
		tile.put(159, new Pair(Assets.houseWallTM,true, false, false, false));
		tile.put(160, new Pair(Assets.houseWallTR,true, false, false, false));
		tile.put(161, new Pair(Assets.houseWallBL,true, false, false, false));
		tile.put(162, new Pair(Assets.houseWallBM,true, false, false, false));
		tile.put(163, new Pair(Assets.houseWallBR,true, false, false, false));
		tile.put(164, new Pair(Assets.houseFloor,false, false, false, false));
		tile.put(165, new Pair(Assets.houseWallBorderTL,true, false, false, false));
		tile.put(166, new Pair(Assets.houseWallBorderTM,true, false, false, false));
		tile.put(167, new Pair(Assets.houseWallBorderTR,true, false, false, false));
		tile.put(168, new Pair(Assets.houseWallBorderML,true, false, false, false));
		tile.put(169, new Pair(Assets.houseWallBorderMR,true, false, false, false));
		tile.put(170, new Pair(Assets.houseWallBorderBL,true, false, false, false));
		tile.put(171, new Pair(Assets.houseWallBorderBM,true, false, false, false));
		tile.put(172, new Pair(Assets.houseWallBorderBR,true, false, false, false));
		tile.put(173, new Pair(Assets.mazeCornerTL,true, false, false, false));
		tile.put(174, new Pair(Assets.mazeCornerTR,true, false, false, false));
		tile.put(175, new Pair(Assets.mazeCornerBL,true, false, false, false));
		tile.put(176, new Pair(Assets.mazeCornerBR,true, false, false, false));
		tile.put(177, new Pair(Assets.shipBorderCornerBL,true, false, false, false));
		tile.put(178, new Pair(Assets.shipBorderCornerBR,true, false, false, false));
		tile.put(179, new Pair(Assets.shipBorderBottomL,true, false, false, false));
		tile.put(180, new Pair(Assets.shipBorderBottomM,true, false, false, false));
		tile.put(181, new Pair(Assets.shipBorderBottomR,true, false, false, false));
		tile.put(182, new Pair(Assets.sky,true, false, false, false));
		tile.put(183, new Pair(Assets.cobbleFloor,false, false, false, false));
		tile.put(184, new Pair(Assets.brokenCobbleFloor,false, false, false, false));
		tile.put(185, new Pair(Assets.crackedStairs,false, false, false, false));
		tile.put(186, new Pair(Assets.houseBorderBRCorner,true, false, false, false));
		tile.put(187, new Pair(Assets.houseBorderBLCorner,true, false, false, false));
		tile.put(188, new Pair(Assets.houseBorderTRCorner,true, false, false, false));
		tile.put(189, new Pair(Assets.houseBorderTLCorner,true, false, false, false));
		tile.put(190, new Pair(Assets.dungeonBorderBRCorner,true, false, false, false));
		tile.put(191, new Pair(Assets.dungeonBorderBLCorner,true, false, false, false));
		tile.put(192, new Pair(Assets.dungeonBorderTRCorner,true, false, false, false));
		tile.put(193, new Pair(Assets.dungeonBorderTLCorner,true, false, false, false));
	}
	
	public void render(Graphics2D g, int x, int y, int id){
		g.drawImage(setImage(id), x, y, TILEWIDTH, TILEHEIGHT, null);
		
	}
	
	
	//returns if the item is unwalkable
	public boolean isSolid(int id){
		try{
			return tile.get(id).getSecond();
		}catch(NullPointerException e){
			return false;
		}
	}
	
	//returns if the tile is able to be slidable
	public boolean isSlide(int id){
		try{
			return tile.get(id).getFifth();
		}catch(NullPointerException e){
			return false;
		}
	}
	
	//returns if the tile hurts the player
	public boolean isHurtful(int id){
		try{
			return tile.get(id).getFourth();
		}catch(NullPointerException e){
			return false;
		}
	}
	
	//returns if the tile is able to be fallen through
	public boolean isDeep(int id){
		try{
			return tile.get(id).getThird();
		}catch(NullPointerException e){
			return false;
		}
	}
		
}
