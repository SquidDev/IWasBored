package org.squiddev.iwasbored.client.gui;

import dan200.computercraft.client.gui.GuiComputer;
import dan200.computercraft.shared.computer.core.ComputerFamily;
import org.squiddev.iwasbored.api.neural.INeuralReference;
import org.squiddev.iwasbored.neural.NeuralContainer;
import org.squiddev.iwasbored.neural.NeuralManager;

/**
 * Neural connector GUI
 */
public class GuiNeuralInterface extends GuiComputer {
	public GuiNeuralInterface(final INeuralReference container) {
		super(
			new NeuralContainer(container),
			ComputerFamily.Advanced,
			NeuralManager.getClient(container.getTag()),
			51,
			19
		);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
	}
}
