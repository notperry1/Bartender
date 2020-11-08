package com.drunkshulker.bartender.util.salhack.events.player;

import com.drunkshulker.bartender.util.salhack.events.MinecraftEvent;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class EventPlayerDamageBlock extends MinecraftEvent
{
    private BlockPos BlockPos;
    private EnumFacing Direction;

    public EventPlayerDamageBlock(BlockPos posBlock, EnumFacing directionFacing)
    {
        BlockPos = posBlock;
        setDirection(directionFacing);
    }

    public BlockPos getPos()
    {
        return BlockPos;
    }

    
    public EnumFacing getDirection()
    {
        return Direction;
    }

    
    public void setDirection(EnumFacing direction)
    {
        Direction = direction;
    }

}
