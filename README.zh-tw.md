# BannerMaker
[![Build Status](https://ci.kid7.club/job/BannerMaker/badge/icon)](https://ci.kid7.club/job/BannerMaker/)
[![bStats](https://img.shields.io/badge/bStats-1.1-brightgreen.svg)](https://bstats.org/plugin/bukkit/BannerMaker)
[![license](https://img.shields.io/github/license/jyhsu2000/BannerMaker.svg)](https://github.com/jyhsu2000/BannerMaker/blob/master/LICENSE)
## Link
* [BukkitDev](https://dev.bukkit.org/projects/bannermaker)
* [Spigot Resource](http://www.spigotmc.org/resources/bannermaker.4380/)
* [巴哈小屋](http://home.gamer.com.tw/creationDetail.php?sn=2760067)
* [MCBBS](http://www.mcbbs.net/thread-415289-1-1.html)

覺得旗幟很有趣，但又不知道該如何合成？  
合成公式太複雜，以致於常常出錯？  
你一定要試試這個這個插件

*Read this in other languages: [English](README.md), [正體中文](README.zh-tw.md).*

## 描述
只要一個指令，你將能透過這插件的介面，設計無數種旗幟。  
不需要瞭解旗幟合成方式，只要知道你希望旗幟長怎樣。

## 功能
* 設計並儲存旗幟
* 查詢旗幟合成表
* 支援UUID
* 多國語言（在config.yml設定）  
  * 英文(en)
  * 正體中文(zh-tw)
  * 簡體中文(zh-cn)
  * 德文(de)（感謝 [Marrarus](https://github.com/Marrarus)）
  * 法文(fr)（感謝 [RedNesto](https://github.com/RedNesto)）
  * 俄文(ru)（感謝 [sdir01](https://www.spigotmc.org/members/sdir01.238854/)）
  * 葡萄牙文(pt-br)（感謝 [Rhander](https://www.spigotmc.org/members/rhander.103119/)）
  * 荷蘭文(nl)（感謝 [DeTrollers](https://www.spigotmc.org/members/detrollers.174265/)）
  * 西班牙文(es)（感謝 [stevejone1997](https://www.spigotmc.org/members/stevejone1997.432373/)、[C4BR3R4](https://www.spigotmc.org/members/c4br3r4.26779/)）
  * 匈牙利文(hu)（感謝 [montlikadani](https://www.spigotmc.org/members/toldi.251100/)）
* 支援經濟功能（需要Vault）
* 材料估算
* 使用材料合成旗幟

## 使用方法
* 請見最下方圖片

## 指令
|**指令**|**描述**|**權限**|
|---|---|---|
|/bm|開啟主要介面|BannerMaker.use|
|/bm help|指令清單||
|/bm hand|顯示手上持有的旗幟的資訊|BannerMaker.hand|
|/bm see|顯示看著的旗幟的資訊|BannerMaker.see|
|/bm reload|重新載入設定檔|BannerMaker.reload|

## 其他權限
|**權限**|**描述**|
|---|---|
|BannerMaker.*|完整權限|
|BannerMaker.getBanner|從介面取得旗幟|
|BannerMaker.getBanner.free|免費取得旗幟|

## 安裝
1. 關閉伺服器
2. 將 .jar 放入 plugins 資料夾
3. 啟動伺服器

## 更新紀錄
v1.9.0 (for 1.8.x, 1.9.x, 1.10.x, 1.11.x, 1.12.x)
- 優化程式碼
- 現在只支援 Java 8
- 更新西班牙文(es)翻譯

*在 [CHANGELOG.zh-tw.md](CHANGELOG.zh-tw.md) 閱讀更多*

## 圖片
![Main menu](http://i.imgur.com/rMTTfsE.png)  
![Create banner](http://i.imgur.com/HB6Dhm3.png)  
![Banner info](http://i.imgur.com/Xydmcbj.png)  
![Alphabet & Number](http://i.imgur.com/tGHmakp.png)
