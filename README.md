# PreRedstone Template Mod for Minecraft 1.21.1

## 📜 Mod Introduction

PreRedstone Template is a revolutionary Minecraft mod designed for version 1.21.1 that transforms how players learn and use redstone. This mod provides a collection of carefully designed "pre-built redstone machine" templates, allowing players to generate complete redstone constructions with a single click. Perfect for:

- Redstone beginners getting started
- Technical survival players boosting efficiency
- Builders quickly implementing functional structures
- Educational redstone teaching scenarios

## ✨ Core Features

### 🏗️ One-Click Generation System
- Smart environment detection for adaptive placement
- Multi-directional placement support
- Material substitution system using available inventory items

### 📚 Learning Assistance
- Interactive tutorials for each template
- Step-by-step build mode (optional)
- Visual redstone signal flow demonstration

### ⚙️ Advanced Customization
- Parameter adjustment interface (size, speed, etc.)
- Material preference settings
- Blueprint editing and sharing

## 📦 Included Machine Categories

### Farming Automation
| Machine Name | Description | Key Components |
|--------------|-------------|----------------|
| Auto Wheat Farm | Fully automatic harvest with bone meal support | Pistons, Observers |
| Sugar Cane/Bamboo Farm | Stackable design with high yield | Sticky Pistons |
| Pumpkin/Melon Farm | Efficient space utilization | Observers |

### Item Processing
| Machine Name | Description | Key Components |
|--------------|-------------|----------------|
| Furnace Array | Scalable from 1 to 16 furnaces | Hoppers |
| Item Sorter | Expandable multi-category system | Comparators |
| Auto Brewer | Supports all potion types | Droppers |

### Mob Farms
| Machine Name | Description | Key Components |
|--------------|-------------|----------------|
| General Mob Grinder | Adjustable height design | Water streams |
| Piglin Farm | Safe gold farming | Nether portals |
| Trading Hall | Automated villager cycling | Workstations |

*(Tables can be expanded...)*

## 🛠️ Installation Guide

### Requirements
- Minecraft 1.21.1
- Fabric Loader 0.15.0+ or Forge 47.1.0+
- Fabric API/Forge (as applicable)

### Installation Steps
1. Download the appropriate mod version:
    - [Fabric Version](download_link)
    - [Forge Version](download_link)
2. Place the .jar file in your `minecraft/mods` folder
3. Configuration files will generate at first launch in `minecraft/config/preredstone`
4. (Optional) Recommended companion mods:
    - [Mod Menu](https://modrinth.com/mod/modmenu)
    - [Cloth Config](https://modrinth.com/mod/cloth-config)

## 🎮 Usage Tutorial

### Basic Usage
1. Obtain the Template Core block:
   ```/give @s preredstone:template_core```
2. Place the core in a suitable location
3. Right-click to open the interface
4. Select machine type from categorized list
5. Adjust generation parameters:
    - Orientation
    - Material substitution rules
    - Special features
6. Confirm generation

### Advanced Features
**Material Substitution:**
When original materials are unavailable:
1. Uses similar items from player inventory
2. Configurable replacement rules
3. Provides material warnings

**Tutorial Mode:**
1. Enable "Learning Mode"
2. Machines generate in stages
3. Each stage explains redstone principles
4. Pause/rewind/fast-forward controls

**Blueprint Sharing:**
1. Export designs with:
   ```/preredstone export <design_name>```
2. Blueprints save to:
   `minecraft/config/preredstone/blueprints`
3. Share with other players

## ⚙️ Configuration Details

Config location: `minecraft/config/preredstone/config.json`

### Main Options
```json
{
  "generation": {
    "max_range": 16,
    "material_replacement": true,
    "safety_check": true
  },
  "tutorial": {
    "enabled": true,
    "speed": "normal",
    "show_designer": true
  },
  "unlocks": {
    "progression_based": true,
    "creative_bypass": false
  }
}
```

### Commands
| Command | Description | Permission |
|---------|-------------|------------|
| `/preredstone reload` | Reload configs | 2 |
| `/preredstone unlock <player> <template>` | Unlock template | 2 |
| `/preredstone list` | Show available templates | 0 |

## ❓ FAQ

**Q: Generated machine isn't working?**
A: Check:
1. Adequate space was available
2. All required materials were provided
3. Game rules allow operation (doTileDrops)

**Q: How to add custom templates?**
A: Create JSON blueprint files following examples in `blueprints/example`

**Q: Compatibility with other redstone mods?**
A: Generally compatible, but may need additional configuration when using blocks from other mods

## 🤝 Contributing

We welcome contributions through:
1. New machine designs
2. Template improvements
3. Localization translations
4. Issue reports and suggestions

Contribution process:
1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-machine`)
3. Commit changes (`git commit -m 'Add new machine'`)
4. Push branch (`git push origin feature/new-machine`)
5. Open a Pull Request

Coding standards:
- 4-space indentation
- Follow Minecraft modding conventions
- Include tests for new features

## 📜 License

MIT Licensed:
- Free to use, modify and distribute
- Must retain original copyright notice
- No warranty provided

Full license text in [LICENSE file](LICENSE)

## 🌟 Acknowledgements

- Minecraft redstone community
- Inspired by Prefab mod
- All testers and contributors

---

**Happy Redstone Engineering!** 🔴⚡

*Version: v1.0.0-beta*

## Contact Us

- 2065157374@qq.com(像hooxi一样s1mple)