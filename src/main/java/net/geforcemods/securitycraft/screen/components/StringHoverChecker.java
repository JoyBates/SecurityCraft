package net.geforcemods.securitycraft.screen.components;

import java.util.Arrays;
import java.util.List;

import net.minecraft.client.gui.widget.button.Button;
import net.minecraftforge.fml.client.gui.HoverChecker;

public class StringHoverChecker extends HoverChecker
{
	private List<String> lines;

	public StringHoverChecker(int top, int bottom, int left, int right, int threshold, String line)
	{
		this(top, bottom, left, right, threshold, Arrays.asList(line));
	}

	public StringHoverChecker(int top, int bottom, int left, int right, int threshold, List<String> lines)
	{
		super(top, bottom, left, right, threshold);
		this.lines = lines;
	}

	public StringHoverChecker(Button button, int threshold, String line)
	{
		this(button, threshold, Arrays.asList(line));
	}

	public StringHoverChecker(Button button, int threshold, List<String> lines)
	{
		super(button, threshold);
		this.lines = lines;
	}

	public String getName()
	{
		return lines.get(0);
	}

	public List<String> getLines()
	{
		return lines;
	}
}
