package com.vlgmv.bace;

import java.util.HashMap;

import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.texture.region.TiledTextureRegion;
import org.andengine.ui.activity.BaseGameActivity;

public class ResourceUtil {

	private static ResourceUtil self;
	private static BaseGameActivity gameActivity;
	private static HashMap<String, ITextureRegion> textureRegionPool;
	private static HashMap<String, TiledTextureRegion> tiledTextureRegionPool;

	private ResourceUtil() {

	}

	public static ResourceUtil getInstance(BaseGameActivity gameActivity) {
		if (self == null) {
			self = new ResourceUtil();
			ResourceUtil.gameActivity = gameActivity;
			BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("gfx/");

			textureRegionPool = new HashMap<String, ITextureRegion>();
			tiledTextureRegionPool = new HashMap<String, TiledTextureRegion>();

		}
		return self;

	}

	public Sprite getSprite(String fileName){
		if(textureRegionPool.containsKey(fileName));
		{
			Spring s = new Sprite(0,0,textureRegionPool.get(fileName),game)
		}
		
	}
}
