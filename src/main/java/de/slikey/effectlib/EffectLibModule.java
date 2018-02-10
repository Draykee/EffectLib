package de.slikey.effectlib;

import de.maddevs.hydrant.api.module.AModule;

import java.util.List;

/**
 * <h1>EffectLibModule</h1>
 * [The EffectLibModule description comes here]
 *
 * @author Drayke
 * @version 1.0
 * @since 11.02.2018
 */
public class EffectLibModule extends AModule
{

    private static EffectLibModule instance;

    public EffectLibModule()
    {
        super( EffectLibModule.class );
    }

    @Override
    public boolean onEnable()
    {
        init( this );
        EffectManager.initialize();
        return true;
    }

    @Override
    public void onDisable()
    {
        super.onDisable();
        EffectManager.disposeAll();
    }

    public List<EffectManager> getEffectManagers()
    {
        return EffectManager.getManagers();
    }

    public static EffectLibModule instance()
    {
        return instance;
    }
}
/***********************************************************************************************
 *
 *                  All rights reserved, MadDevs (c) copyright 2017
 *
 ***********************************************************************************************/