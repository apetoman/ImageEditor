package com.createchance.imageeditor;

/**
 * Transition Context interface.
 *
 * @author createchance
 * @date 2018/12/28
 */
public interface TransitionContext {
    int getSurfaceWidth();

    int getSurfaceHeight();

    int getRenderWidth();

    int getRenderHeight();

    int getRenderLeft();

    int getRenderTop();

    int getRenderRight();

    int getRenderBottom();

    int getInputTextureId();

    int getOutputTextureId();

    int getFromTextureId();

    int getToTextureId();

    void bindOffScreenFrameBuffer();

    void attachOffScreenTexture(int textureId);

    void bindDefaultFrameBuffer();

    void swapTexture();
}
