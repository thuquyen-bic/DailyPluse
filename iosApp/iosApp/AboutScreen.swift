//
//  AboutScreen.swift
//  iosApp
//
//  Created by Quyen Quyen on 18/04/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

struct AboutScreen: View {
    var body: some View {
        NavigationStack{
            AboutListView().navigationTitle("About Device")
        }
    }
}

#Preview {
    AboutScreen()
}
