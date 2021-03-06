package club.kid7.bannermaker.util;

import club.kid7.bannermaker.BannerMaker;
import club.kid7.pluginutilities.configuration.KConfigManager;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class EconUtil {
    /**
     * 取得旗幟的價格
     *
     * @param banner 旗幟
     * @return 價格
     */
    public static double getPrice(ItemStack banner) {
        if (!BannerUtil.isBanner(banner)) {
            return 0;
        }
        if (BannerMaker.getInstance().econ == null) {
            return 0;
        }
        FileConfiguration config = KConfigManager.get("config");
        if (config == null) {
            return 0;
        }
        double price = config.getDouble("Economy.Price", 0);

        List<ItemStack> materials = BannerUtil.getMaterials(banner);
        for (ItemStack material : materials) {
            price += getMaterialPrice(material) * material.getAmount();
        }

        return price;
    }

    private static double getMaterialPrice(ItemStack itemStack) {
        String priceConfigFileName = "price";
        FileConfiguration priceConfig = KConfigManager.get(priceConfigFileName);
        if (priceConfig == null) {
            return 0;
        }
        //物品資料
        Material type = itemStack.getType();
        Short durability = itemStack.getDurability();
        //預設路徑
        String configPath = type.toString();
        //特殊路徑
        if (type == Material.WOOL) {
            DyeColor woolColor = DyeColorUtil.fromInt(15 - durability);
            configPath = "WOOL." + woolColor.name();
        } else if (type == Material.INK_SACK) {
            DyeColor dyeColor = DyeColorUtil.fromInt(durability);
            configPath = "DYE." + dyeColor.name();
        } else if (type == Material.SKULL_ITEM) {
            if (durability == 1) {
                configPath = "WITHER_SKELETON_SKULL";
            } else if (durability == 4) {
                configPath = "CREEPER_SKULL";
            }
        } else if (type == Material.RED_ROSE) {
            configPath = "ROSE";
        }
        //檢查設定
        if (!priceConfig.contains(configPath)) {
            priceConfig.set(configPath, 0);
            KConfigManager.save(priceConfigFileName);
        }

        //取得金額
        return priceConfig.getDouble(configPath, 0);
    }
}
