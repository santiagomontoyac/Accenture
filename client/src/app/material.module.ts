import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
// Material Angular
import { MatMomentDateModule } from '@angular/material-moment-adapter';
import { MatFormFieldModule, MatAutocompleteModule, MatButtonModule, MatButtonToggleModule, MatCardModule, MatCheckboxModule, MatChipsModule, MatDatepickerModule, MatDialogModule, MatExpansionModule, MatGridListModule, MatIconModule, MatInputModule, MatListModule, MatMenuModule, MatNativeDateModule, MatProgressBarModule, MatProgressSpinnerModule, MatRadioModule, MatRippleModule, MatSelectModule, MatSidenavModule, MatSliderModule, MatSlideToggleModule, MatSnackBarModule, MatStepperModule, MatTableModule, MatTabsModule, MatToolbarModule, MatTooltipModule, MatPaginatorModule, MatSortModule } from '@angular/material';
import {MatBottomSheetModule} from '@angular/material/bottom-sheet';
// Material File Upload
// import { MatFileUploadModule } from 'angular-material-fileupload';

const modules = [
  CommonModule, MatInputModule, MatSelectModule, MatSlideToggleModule, MatDatepickerModule, MatFormFieldModule, MatMomentDateModule, MatButtonModule, MatTableModule, MatPaginatorModule, MatSortModule, MatProgressSpinnerModule, MatAutocompleteModule, MatButtonToggleModule, MatCardModule, MatCheckboxModule, MatChipsModule, MatDatepickerModule, MatDialogModule, MatExpansionModule, MatGridListModule, MatIconModule, MatListModule, MatMenuModule, MatNativeDateModule, MatProgressBarModule, MatRadioModule, MatRippleModule, MatSidenavModule, MatSliderModule, MatSlideToggleModule, MatSnackBarModule, MatStepperModule, MatTabsModule, MatToolbarModule, MatTooltipModule, MatBottomSheetModule
];
@NgModule({
  imports: [...modules],
  exports: [...modules],
  declarations: []
})
export class MaterialModule { }
