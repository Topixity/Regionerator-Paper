package com.github.jikoo.regionerator.world.impl.linear;

/**
 * Minimal chunk coordinate holder.
 *
 * <p>Replaces {@code net.minecraft.world.level.ChunkPos}: the linear region reader only ever used
 * the {@code x}/{@code z} fields of that class, and depending on it forced the whole build through
 * the {@code paper-nms} remapping chain, which has no artifact for Minecraft 26.2.</p>
 */
public record ChunkPos(int x, int z) {

  /** Field-style accessor kept so existing {@code pos.x} usages compile unchanged. */
  public int getX() {
    return x;
  }

  public int getZ() {
    return z;
  }
}
