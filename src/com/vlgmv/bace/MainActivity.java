package com.vlgmv.bace;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.ui.activity.SimpleLayoutGameActivity;

public class MainActivity extends SimpleLayoutGameActivity {

	// ��ʃT�C�Y
	private int CAMERA_WIDTH = 480;
	private int CAMERA_HEIGHT = 800;

	public EngineOptions onCreateEngineOptions() {
		// �T�C�Y�w��`��͈̓C���X�^���X��
		final Camera camera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
		EngineOptions eo = new EngineOptions(true,
				ScreenOrientation.PORTRAIT_FIXED, new RatioResolutionPolicy(
						CAMERA_WIDTH, CAMERA_HEIGHT), camera);
		return eo;

	}

	@Override
	protected void onCreateResources() {

	}

	@Override
	protected Scene onCreateScene() {

		MainScene mainScene = new MainScene(this);
		return mainScene;

	}

	@Override
	protected int getLayoutID() {

		return R.layout.activity_main;
	}

	@Override
	protected int getRenderSurfaceViewID() {
		return R.id.renderview;

	}

}
