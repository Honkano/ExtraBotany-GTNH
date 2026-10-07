# ExtraBotany-GTNH

[![Minecraft](https://img.shields.io/badge/Minecraft-1.7.10-green.svg)](https://www.minecraft.net/)
[![Forge](https://img.shields.io/badge/Forge-10.13.4.1614-orange.svg)](https://files.minecraftforge.net/)
[![Botania](https://img.shields.io/badge/Botania-GTNH%20Edition-blue.svg)](https://github.com/GTNewHorizons/Botania)
[![License](https://img.shields.io/badge/License-LGPL--3.0-lightgrey.svg)](LICENSE)

> **A revived and GTNH-maintained edition of ExtraBotany.**
> **额外植物学 —— GTNH 维护复活版**

---

## 💌 写在前面 / A Note from the Maintainer

### 中文

八年前，一个叫 **Meteor** 的人写了一个模组。

他给植物魔法加了一些花。一些奇怪的花。

——晚上才开、白天就谢的彼岸花；
——吃饼干吐箱子的糖果花；
——把岩浆烧成火海、把火海烧成净土的源凤仙；
——从虚空中长出来、会挖矿的虚空花。

他写得很认真，虽然很多地方还差一点点没完成。
他在 `README` 上老老实实地写着：

> *Flowers(92% Finished)*
> *Lexicon(55% Finished)*
> *Rebalance(45% Finished)*
> *Elven Minion(10% Finished)*

后来，他走了。这个模组停在了 **r1.0-20**。
它留在了 1.7.10，那个属于它的时代。

**八年后，我把它捡了起来。**

我不敢说自己接得住他留下的东西。但我想说：

**这朵花，不该就这么谢掉。**

于是，我用 GTNH 的构建系统把它重新种了回去。
把所有依赖换成了 GTNH 维护的版本，把它重新编译、重新测试、重新补全。
我还找了 AI 帮忙一起修代码、对字节码、翻译语言文件。

**——现在，它又能开了。**

**但版权，永远属于 Meteor。**
这是他的花。我只是一个浇水的。

### English

Eight years ago, a person named **Meteor** wrote a mod.

He added some flowers to Botania. Some strange flowers.

— A **Lycorisradiata** that only blooms at night and withers at dawn;
— A **Candy Flower** that eats cookies and spits out boxes;
— A **Numeron Balsam** that burns lava into fire, and fire into purity;
— A **Voiduim** that grows out of the void and digs ores.

He wrote it with care, even though many parts were left unfinished.
His own `README` said, honestly:

> *Flowers(92% Finished)*
> *Lexicon(55% Finished)*
> *Rebalance(45% Finished)*
> *Elven Minion(10% Finished)*

Then, he left. The mod stopped at **r1.0-20**.
It stayed on 1.7.10, in its own era.

**Eight years later, I picked it up.**

I can't say I'm worthy of what he left behind. But I want to say:

**This flower doesn't deserve to wither like this.**

So, I replanted it using GTNH's build system.
I swapped all dependencies to GTNH-maintained versions, recompiled it, retested it, restored it.
I also worked with AI to fix code, compare bytecode, and translate language files.

**— And now, it can bloom again.**

**But the copyright will forever belong to Meteor.**
This is his flower. I'm just the one watering it.

---

## 📖 关于本项目 / About This Project

### 中文

**ExtraBotany（额外植物学）** 是植物魔法（Botania）的一个经典附属模组，
由原作者 **ExtraMeteorP（Meteor）** 于 2017 年前后开发。

它给 1.7.10 时代带来了大量独具特色的花朵、遗物、BOSS 与联动物品，
是很多人心中"植物魔法生态链"不可或缺的一环。

**本项目是它在 GTNH 生态下的维护复活版。**

我们不新增玩法，不改变原有设计思路，
只做三件事：

1. **让它能在 GTNH 环境下正常编译、正常跑**
2. **修复原作者遗留的崩溃 bug**
3. **补全源码里被删掉的部分**

**本项目只维护 1.7.10 生态，不涉及 1.12.2、1.16.5 或更高版本。**

如果你想要高版本的额外植物学，社区里可能有人做过移植
（例如 1.12.2 的"额外神秘"、1.16.5 的社区版等），
**那些都是他们自己的作品，与本项目无关。**

### English

**ExtraBotany** is a classic addon for Botania,
originally developed by **ExtraMeteorP (Meteor)** around 2017.

It brought a large collection of unique flowers, relics, bosses,
and cross-mod items to the 1.7.10 era,
and became an indispensable part of the "Botania ecosystem" for many players.

**This project is its revived, GTNH-maintained edition.**

We don't add new content, we don't change the original design philosophy.
We only do three things:

1. **Make it compile and run properly under GTNH**
2. **Fix crash bugs left by the original author**
3. **Restore parts deleted from the original source**

**This project only maintains the 1.7.10 ecosystem.**
It does not cover 1.12.2, 1.16.5, or later versions.

If you want ExtraBotany for a newer version,
someone in the community may have ported it
(e.g. "Thaumic Extra" for 1.12.2, or community versions for 1.16.5).
**Those are their own works and have nothing to do with this project.**

---

## 🌸 关于额外植物学的故事 / The Story of ExtraBotany

### 中文

在植物魔法的世界里，有一本叫 **《植物魔法手册》** 的书。
它记录了所有花、符文、遗物的知识，是每一位植物魔法师的入门指引。

但在这本手册**没有写到的角落**，还藏着一些东西——

> 一朵只在夜晚绽放、太阳升起就凋零的**彼岸花**。
> 一朵会吞噬糖果、吐出神秘箱子的**糖果花**。
> 一朵吞噬噪音、疯狂到癫狂的**闹闹花**。
> 一只戴着墨镜、会讲冷笑话的**波动狗**。
> 一张能让骰子变成 20 面、决定你命运的**D20**。

这些，就是**额外植物学**——
一本没有正式出版的"番外篇"。

它的风格和植物魔法本体不同：**更中二、更二次元、更多梗**。

你会在这里看到 **《游戏人生》的白卡**、
**《东方Project》的 U.N.OWEN 唱片**、
**《命运石之门》的凤凰冲击波**、
**《Undertale》的波动狗**、
**《Re:从零开始的异世界生活》的虚空花**……

**它不是植物魔法的正统续作，而是一位玩家写给植物魔法的一封情书。**

八年后，这封情书被人重新拾起。

原作者走了，但他留下的种子，被我们重新种回土里。

——它也许不会再长出新的花，
但至少，它还能继续开花。

### English

In the world of Botania, there is a book called the **Lexica Botania**.
It records all knowledge of flowers, runes, and relics,
guiding every aspiring botanist.

But in the corners **the Lexica never mentions**, something else lives——

> A **Lycorisradiata** that only blooms at night and withers at dawn.
> A **Candy Flower** that devours sweets and spits out Mystery Boxes.
> A **Pysch-O-Bloom** driven mad by noise.
> An **Annoying Dog** that tells bad jokes in sunglasses.
> A **D20** that rolls your fate.

This is **ExtraBotany** —
an unofficial spin-off chapter, never formally published.

Its style differs from Botania proper:
**more chuunibyou, more anime, more memes.**

Here you'll meet **Blank Card from *No Game No Life***,
**U.N.OWEN's record from *Touhou***,
**Phoenix Blaster from *Steins;Gate***,
**the Annoying Dog from *Undertale***,
**Voiduim from *Re:Zero***…

**It is not the official sequel to Botania.
It is a love letter written by a player, to Botania.**

Eight years later, someone picked up that letter again.

The author is gone, but the seeds he left behind
have been planted back into the soil.

— It may not grow new flowers.
But at least, it can keep blooming.

---

## 🚀 快速开始 / Quick Start

### 中文

**必需前置：**

| 模组 | 版本 | 说明 |
|---|---|---|
| Minecraft | 1.7.10 | 本模组只支持 1.7.10 |
| Forge | 10.13.4.1614 | 推荐版本 |
| **Botania** | **GTNH 版 1.13.36-GTNH 或更高** | **必须使用 GTNH 维护版** |
| **Baubles** 或 **Baubles Expanded** | 1.0.1.10+ / 任意 | Botania 前置，两者均可 |
| **CodeChickenCore** | **GTNH 维护版 1.4.22+** | NEI 前置 |
| **NotEnoughItems** | **GTNH 维护版 2.8.144-GTNH+** | NEI |
| **GTNHLib** | 0.11.35+ | GTNH Botania 前置 |
| **UniMixins** | 0.3.1+ | Mixin 引导 |

**可选前置（用于跨模组联动）：**

本模组会在运行时通过 `Loader.isModLoaded(...)` 检测以下模组。**安装了对应模组后，会自动启用联动；未安装则跳过，不影响游戏。**

| 模组 | 联动内容 |
|---|---|
| **Thaumcraft 4.2.3.5** | 符文护盾接口、使魔护目镜、节点可视化、注魔稳定器等 |
| **Ars Magica 2（AM2）** | 部分物品和技能的联动 |
| **AnimationAPI** | AM2 的前置 |
| **CandyCraft** | 糖果花会识别糖果工艺的糖果物品 |
| **Pam's HarvestCraft** | 糖果花会识别潘马斯农场的甜品 |
| **BuildCraft** | 部分机器和管道联动 |
| **MineTweaker3** | 支持用 MineTweaker 脚本自定义配方 |
















**编译：**













```bash
gradlew build
产物位于 build/libs/。

English
Required dependencies:
















Mod	Version	Notes
Minecraft	1.7.10	1.7.10 only
Forge	10.13.4.1614	Recommended
Botania	GTNH Edition 1.13.36-GTNH or higher	GTNH-maintained version required
Baubles or Baubles Expanded	1.0.1.10+ / any	Botania dependency, either works
CodeChickenCore	GTNH 1.4.22+	NEI dependency
NotEnoughItems	GTNH 2.8.144-GTNH+	NEI
GTNHLib	0.11.35+	GTNH Botania dependency
UniMixins	0.3.1+	Mixin bootstrap
Optional (for cross-mod integration):

This mod uses Loader.isModLoaded(...) at runtime to detect the following mods. If installed, the corresponding integration is enabled automatically; if not, it is skipped without affecting gameplay.

Mod	Integration content
Thaumcraft 4.2.3.5	Runic armor interface, Goggles of Revealing, node visualization, infusion stabilisers, etc.
Ars Magica 2 (AM2)	Item & spell interactions
AnimationAPI	AM2 dependency
CandyCraft	Candy Flower recognizes CandyCraft candies
Pam's HarvestCraft	Candy Flower recognizes Pam's desserts
BuildCraft	Machines and pipes integration
MineTweaker3	Custom recipe support via MineTweaker scripts
Build:

bash
gradlew build
Output: build/libs/.

📦 依赖配置参考 / Dependency Configuration
本项目使用 GTNH 官方构建模板（RetroFuturaGradle）。
以下为 dependencies.gradle 的完整配置：

gradle
dependencies {
    // === 核心前置：编译 + 运行都需要 ===
    devOnlyNonPublishable('com.github.GTNewHorizons:Botania:1.13.36-GTNH:dev')
    compile files('libs/Thaumcraft-deobf-1.7.10-4.2.3.5.jar')
    compile files('libs/CodeChickenCore-1.4.22-dev.jar')
    compile files('libs/NotEnoughItems-2.8.144-GTNH-dev.jar')

    // === GTNH 库，提供 MusicRecordMetadataProvider 接口 ===
    compile 'com.github.GTNewHorizons:GTNHLib:0.6.16:dev'

    // === 编译需要，运行不需要（避免 coremod 卡死） ===
    compileOnly files('libs/1.7.10_AM2-1.4.0.008.jar')
    compileOnly files('libs/AnimationAPI-1.7.10-1.2.4.jar')
    compileOnly files('libs/CandyCraft-1.3(1.7.10).jar')
    compileOnly files("libs/PamsHarvestCraft1.7.10.jar")
    compileOnly files('libs/buildcraft-7.1.14.jar')
    compileOnly files('libs/MineTweaker3-Dev-1.7.10-3.0.9C.jar')

    // Mixin 编译依赖（Sponge Mixin —— 用 Maven 坐标，不要 files()）
    compileOnly("org.spongepowered:mixin:0.8.5")
}
说明：

devOnlyNonPublishable 的 Botania 与 compile 的 GTNHLib 是运行必需

compileOnly 的模组只在编译时提供 API，运行时不加载，避免 coremod 卡死

🛠️ 技术改动说明 / Technical Notes
中文
相比原作者的最后版本（r1.0-20），本项目做了以下技术调整：

项目	原作者版本	本项目
构建系统	ForgeGradle 1.x	RetroFuturaGradle（GTNH 官方模板）
Botania	原版 r1.8-249	GTNH 版 1.13.36-GTNH+
NEI	原版 1.0.5.120	GTNH 版 2.8.144-GTNH+
CodeChickenCore	原版 1.0.7.47	GTNH 版 1.4.22+
CodeChickenLib	独立依赖	已合并进 CodeChickenCore 1.4.22+
Mixin 环境	无	UniMixins 0.3.1+
额外依赖	无	GTNHLib 0.11.35+
配方 API	Botania 旧 API	GTNH Botania 新 API
所有依赖库均已从原版替换为 GTNH 维护版本，
以保证与现代 GTNH 整合包的兼容性。

我们还额外做了：

清理了 __OBFID 等 MCP 反编译痕迹

统一了 mcmod.info 格式（${modId} 占位符）

补全了 en_US.lang 和 zh_CN.lang 中缺失的翻译

修复了 EntityGaiaIIIDark 的宝箱掉落表错误

补充了原作者删除的 7 种子弹实体注册

修复了黑暗盖亚 III 无限重生的 bug

修复了诸神套装可能被踢出服务器的问题

English
Compared with the original author's last version (r1.0-20),
this project made the following technical changes:

Item	Original	This Project
Build system	ForgeGradle 1.x	RetroFuturaGradle (GTNH template)
Botania	Original r1.8-249	GTNH Edition 1.13.36-GTNH+
NEI	Original 1.0.5.120	GTNH 2.8.144-GTNH+
CodeChickenCore	Original 1.0.7.47	GTNH 1.4.22+
CodeChickenLib	Separate dependency	Merged into CodeChickenCore 1.4.22+
Mixin env	None	UniMixins 0.3.1+
Extra deps	None	GTNHLib 0.11.35+
Recipe API	Botania old API	GTNH Botania new API
All dependency libraries have been replaced with GTNH-maintained versions
to ensure compatibility with modern GTNH modpacks.

Additional work:

Cleaned up MCP decompilation residue such as __OBFID

Unified mcmod.info format (${modId} placeholders)

Completed missing translations in en_US.lang and zh_CN.lang

Fixed the chest loot table in EntityGaiaIIIDark

Restored the 7 bullet entity registrations deleted by the original author

Fixed the infinite respawn bug of Dark Gaia III

Fixed the server-kick issue with the Olympian armor set

🔮 关于未来的走向 / Future Direction

中文
关于 1.7.10 生态：

本项目会持续维护。如果 GTNH 后续更新了 Botania 或其他依赖库，
导致本项目出现兼容性问题，我们会跟进修复。

关于新功能与移植建议：

如果你在高版本（1.12.2、1.16.5 等）的额外植物学移植版中看到任何有趣的功能，
欢迎提交 Issue，我会尝试将它们移植到 1.7.10。

本项目不仅限于维护，也会加入新的功能。
我目前也在接手另一个项目「自然魔法」，可以查看我的其他仓库。

关于高版本：

本项目不会移植到 1.12.2、1.16.5 或更高版本。

原因很简单：

原作者的设计思路是 1.7.10 时代的

高版本的 Botania API 已经大改，移植需要重写大量代码

社区里已经有人在做高版本移植，不需要我们重复劳动

本项目只关心 1.7.10。

English
About the 1.7.10 ecosystem:

This project will be continuously maintained.
If GTNH updates Botania or other dependencies
and causes compatibility issues with this project,
we will fix them.

About new features & porting suggestions:

If you see any interesting features in higher-version ports of ExtraBotany
(1.12.2, 1.16.5, etc.), feel free to submit an Issue,
and I will try to port them to 1.7.10.

This project is not limited to maintenance — new features will be added too.
I am also taking over another project "Natural Magic",
you can check my other repositories.

About newer versions:

This project will NOT be ported to 1.12.2, 1.16.5, or later.

The reason is simple:

The original author's design philosophy belongs to the 1.7.10 era

Botania's API has changed drastically in newer versions,
porting would require rewriting large amounts of code

The community already has porters working on newer versions,
we don't need to duplicate that effort

This project only cares about 1.7.10.

🙏 致谢 / Credits
原作者 / Original Author:

ExtraMeteorP (Meteor) —— 额外植物学的创造者

GitHub: https://github.com/ExtraMeteorP

This project would not exist without him. All credit to him.

Botania / 植物魔法:

Vazkii —— Botania 原作者

GTNH 团队 / GTNH Team:

GTNewHorizons —— 1.7.10 生态的守护者

本项目依赖的所有库都由他们维护

GitHub: https://github.com/GTNewHorizons

其他开源作者 / Other Open Source Authors:

SpitefulFox 及其他贡献者

本项目的维护者 / Maintainer:

KongTai (空太)

AI 协作 / AI Collaboration:

DeepSeek AI —— 参与代码补全、字节码对比、语言文件翻译

📜 版权声明 / License
LGPL-3.0，与 Botania 和原版 ExtraBotany 保持一致。

本项目不主张任何新的版权。

所有代码、素材的版权永远属于原作者 ExtraMeteorP。
本项目仅对代码进行适配、修复与补全，
目的是让这个模组能够在现代 GTNH 环境中继续运行。

License: LGPL-3.0, consistent with Botania and the original ExtraBotany.

This project claims no new copyright.

All rights to the code and assets forever belong to the original author, ExtraMeteorP.
This project only adapts, fixes, and completes the code,
with the sole purpose of keeping this mod running in the modern GTNH environment.

🔗 相关链接 / Links
本项目仓库 / This Repo: https://github.com/Honkano/ExtraBotany-GTNH

原作者仓库 / Original Repo: https://github.com/ExtraMeteorP/Extra-Botany

Botania (GTNH): https://github.com/GTNewHorizons/Botania

GTNH 官网 / GTNH Homepage: https://gtnewhorizons.com/

<p align="center"> <i>「这朵花，只为你而开。」</i><br> <i>"This flower blooms only for you."</i> </p><p align="center"> <i>—— For Meteor, the original author.</i><br> <i>—— 献给 Meteor，永远的原作者。</i> </p> ```