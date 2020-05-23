package onimen.anni.hmage.gui.button;

import java.util.Arrays;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.resources.I18n;
import onimen.anni.hmage.gui.CapeSetting;

public class CapeSelectButtonObject implements ButtonObject {

  @Override
  public String getTitle() {
    return "Cape";
  }

  @Override
  public String getButtonText() {
    return "Cape Select";
  }

  @Override
  public void actionPerformed(GuiButton button) {
    Minecraft.getMinecraft().displayGuiScreen(new CapeSetting());
  }

  @Override
  public List<String> getDescription() {
    return Arrays.asList(I18n.format("hmage.setting.desc.capeselect"));
  }

}
